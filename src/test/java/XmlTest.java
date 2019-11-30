import org.junit.Test;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class XmlTest {
    XmlCheck xmlCheck;

    @Test
    public void checkTest() throws IOException, SAXException, ParserConfigurationException {
        assertTrue(xmlCheck.xmlCheck("test.xml"));
    }

    @Test
    public void checkTest1() throws IOException, SAXException, ParserConfigurationException {
        assertFalse(xmlCheck.xmlCheck("testwrong.xml"));
    }
}
