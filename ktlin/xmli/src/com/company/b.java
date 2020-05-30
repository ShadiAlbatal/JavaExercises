package com.company;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class b{

    private f f= new f();
    public void parseXml() throws IOException, SAXException, ParserConfigurationException {

        try {

//            String path= "src/com/company/prod.xml";
//            File filePath= new File(path);
            Path filePath= Paths.get("src/com/company/prod.xml");
            File inputFile = new File(String.valueOf(filePath));
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            // nlist
            NodeList nList = doc.getElementsByTagName("bar");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                // nnode
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;


                    System.out.println("product serial number : " +
                            eElement.getAttribute("SN"));

//                    System.out.println("prot: " +
//                            eElement.getElementsByTagName("protein").item(0).getTextContent());

                    eElement.getElementsByTagName("review");
                    NodeList n = eElement.getChildNodes();
                    System.out.println( " nodeList length is: " + n.getLength());


                    for (int i = 0; i < nList.getLength(); i++) {
                        Node d = nList.item(temp);
                        System.out.println("\nCurrent Element :" + nNode.getNodeName());

                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element e = (Element) nNode;


                            System.out.println("personID : " +
                                    eElement.getAttribute("personID"));

                            System.out.println("date: " +
                                    eElement.getElementsByTagName("date").item(0).getTextContent());

                            System.out.println("score: " +
                                    eElement.getElementsByTagName("score").item(0).getTextContent());

                        }
                    }

                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

}
