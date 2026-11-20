import java.io.File;
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

public class ModificarXML {
    public static void main(String[] args) {
        try {
            File archivo = new File("alumnos.xml");
            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            fabrica.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);

            DocumentBuilder constructor = fabrica.newDocumentBuilder();
            Document documento = constructor.parse(archivo);
            documento.getDocumentElement().normalize();

            NodeList lista = documento.getElementsByTagName("alumno");
            boolean encontrado = false;

            for (int i = 0; i < lista.getLength(); i++) {
                Element alumno = (Element) lista.item(i);
                if ("2".equals(alumno.getAttribute("id"))) {
                    alumno.getElementsByTagName("nombre").item(0).setTextContent("Juan");
                    alumno.getElementsByTagName("edad").item(0).setTextContent("19");
                    alumno.getElementsByTagName("ciclo").item(0).setTextContent("ASIR");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se ha encontrado el alumno con ID 2.");
                return;
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.transform(new DOMSource(documento), new StreamResult(archivo));

            System.out.println("Alumno modificado correctamente.");
        } catch (Exception e) {
            System.err.println("Error modificando el archivo XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
