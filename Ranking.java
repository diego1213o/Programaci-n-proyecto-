
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Ranking {

    public static void guardarPuntuacion(String nombre, int puntuacion) {
        try {
            File archivo = new File(".vscode/ranking.xml");

            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            DocumentBuilder constructor = fabrica.newDocumentBuilder();

            Document documento;

            if (archivo.exists()) {
                documento = constructor.parse(archivo);
            } else {
                documento = constructor.newDocument();
                Element raiz = documento.createElement("ranking");
                documento.appendChild(raiz);
            }

            Element raiz = documento.getDocumentElement();
            Element jugador = documento.createElement("jugador");

            Element nombreJugador = documento.createElement("nombre");
            nombreJugador.appendChild(documento.createTextNode(nombre));
            jugador.appendChild(nombreJugador);

            Element puntos = documento.createElement("puntuacion");
            puntos.appendChild(documento.createTextNode(String.valueOf(puntuacion)));
            jugador.appendChild(puntos);

            raiz.appendChild(jugador);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            transformer.transform(new DOMSource(documento), new StreamResult(archivo));

            System.out.println("Puntuacion guardada correctamente.");

        } catch (Exception e) {
            System.out.println("Error al guardar la puntuacion: " + e.getMessage());
        }
    }

    public static void mostrarRanking() {
        try {
            File archivo = new File(".vscode/ranking.xml");

            if (!archivo.exists()) {
                System.out.println("Todavia no hay puntuaciones.");
                return;
            }

            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            DocumentBuilder constructor = fabrica.newDocumentBuilder();
            Document documento = constructor.parse(archivo);

            NodeList lista = documento.getElementsByTagName("jugador");

            if (lista.getLength() == 0) {
                System.out.println("Todavia no hay puntuaciones.");
                return;
            }

            ArrayList<Element> jugadores = new ArrayList<>();

            for (int i = 0; i < lista.getLength(); i++) {
                jugadores.add((Element) lista.item(i));
            }

            for (int i = 0; i < jugadores.size() - 1; i++) {
                for (int j = i + 1; j < jugadores.size(); j++) {
                    int puntos1 = Integer.parseInt(
                        jugadores.get(i).getElementsByTagName("puntuacion").item(0).getTextContent()
                    );

                    int puntos2 = Integer.parseInt(
                        jugadores.get(j).getElementsByTagName("puntuacion").item(0).getTextContent()
                    );

                    if (puntos2 > puntos1) {
                        Element temporal = jugadores.get(i);
                        jugadores.set(i, jugadores.get(j));
                        jugadores.set(j, temporal);
                    }
                }
            }

            System.out.println("=== RANKING ===");

            for (int i = 0; i < jugadores.size(); i++) {
                Element jugador = jugadores.get(i);

                String nombre = jugador.getElementsByTagName("nombre").item(0).getTextContent();
                String puntos = jugador.getElementsByTagName("puntuacion").item(0).getTextContent();

                System.out.println((i + 1) + ". " + nombre + " - " + puntos + " puntos");
            }

        } catch (Exception e) {
            System.out.println("Error al leer el ranking: " + e.getMessage());
        }
    }
}
