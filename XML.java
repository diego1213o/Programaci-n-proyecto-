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

public class XML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            DocumentBuilder constructor = fabrica.newDocumentBuilder();
            Document documento = constructor.newDocument();

            Element raiz = documento.createElement("alumnos");
            documento.appendChild(raiz);

            Element alumno = documento.createElement("alumno");
            alumno.setAttribute("id", "1");

            Element nombre = documento.createElement("nombre");
            nombre.appendChild(documento.createTextNode("Ana"));
            alumno.appendChild(nombre);

            Element edad = documento.createElement("edad");
            edad.appendChild(documento.createTextNode("18"));
            alumno.appendChild(edad);

            Element ciclo = documento.createElement("ciclo");
            ciclo.appendChild(documento.createTextNode("DAM"));
            alumno.appendChild(ciclo);

            raiz.appendChild(alumno);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            transformer.transform(new DOMSource(documento), new StreamResult(new File("alumnos.xml")));
            System.out.println("Archivo XML generado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al generar el archivo XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}