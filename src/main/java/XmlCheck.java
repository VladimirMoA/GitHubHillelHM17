import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class XmlCheck extends DefaultHandler {

    public static boolean xmlCheck(String uri) throws ParserConfigurationException, SAXException, IOException {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler();
            saxParser.parse(uri, handler);
        } catch (SAXParseException e) {
            System.out.println("Не хватает тега(ов), проверьте xml файл");
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        xmlCheck("test.xml");
    }

}
