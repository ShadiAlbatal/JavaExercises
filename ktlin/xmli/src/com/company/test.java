package com.company;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test{

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

                    System.out.println("prot: " +
                            eElement.getElementsByTagName("protein").item(0).getTextContent());

                      NodeList f= eElement.getElementsByTagName("reviewer");
                    NodeList n = eElement.getChildNodes();
                    System.out.println( " nodeList length is: " + n.getLength());


                    for (int i = 0; i < n.getLength(); i++) {
                        Node d = n.item(i);
                        System.out.println("\nCurrent Element :" + d.getNodeName());

                        if (d.getNodeType() == Node.ELEMENT_NODE) {
                            Element e = (Element) d;


                            System.out.println("personID : " +
                                    e.getAttribute("personID"));

                            System.out.println("date: " +
                                    e.getElementsByTagName("date").item(0).getTextContent());

                            System.out.println("score: " +
                                    e.getElementsByTagName("score").item(0).getTextContent());

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
