/*
 *
 *
 *
 *
 * */

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

//The text within every node is called the text node.
public class Main {

    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder =  factory.newDocumentBuilder();
            Document doc = builder.parse("persons.xml");

            NodeList personList = doc.getElementsByTagName("person");

            for(int i=0; i<personList.getLength(); i++){
                Node p= personList.item(i);
                if (p.getNodeType()==Node.ELEMENT_NODE){  // the 'person' tag is an element node
                    Element person = (Element) p;
                    String id = person.getAttribute("id");
                    NodeList nameList = person.getChildNodes();
                    for(int j=0; j<nameList.getLength();j++){
                        Node n = nameList.item(j);
                        if(n.getNodeType()==Node.ELEMENT_NODE){
                            Element name = (Element) n;
                            System.out.println("Person "+id+":"+name.getTagName() +" = "+name.getTextContent());
                        }
                    }
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
