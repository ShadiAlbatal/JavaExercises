package com.company;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class Main {

    static int countX;

    static String colDel = "\t ";
    static File file = new File("src/com/company/prod.xml");

    private static Scanner userInputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        handleUserInputOption();
    }

    private static void handleUserInputOption() {
        clearConsole();

        printMenuOptions();

        System.out.print("\nPlease choose an option from the above list: ");

        String userInputOption = userInputScanner.nextLine();

        switch (userInputOption) {

            case "0":
                clearConsole();
                System.out.println("\nThe processing has been successfully terminated \n");
                System.exit(0);
                break;

            case "1":
                printXMLfile();
                break;

            case "2":
                inactiveOption();
                break;

            case "3":
                inactiveOption();
                break;

            case "4":
                inactiveOption();
                break;

            case "5":
                inactiveOption();
                break;

            default:
                System.out.println("\nYour inpur ( " + userInputOption
                        + " ) is not listed in the below Menu,Please choose an Option from the list\n");
                handleUserInputOption();
                break;

        }
    }

    private static void printMenuOptions() {
        System.out.println("\nPick an opti \n\n" + "(1) Show the name of all bars.\n"
                + "(2) Sort bars  based on highest protein content.\n" + "(3) Sort bars based on highest fat content\n"
                + "(4) Filter bars which has less than \"some number from the user\" fiber and sort them from highest to lowest\n"
                + "(5) Find all protein bars with more than X protein reviewed by Y (X and Y should be entered from the user)\n");

    }

    private static void printXMLfile() {

        try {

            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

            Document document = documentBuilder.parse(file);

            System.out.println(" product" + colDel + "fett" + colDel + "energy " + colDel + "kolhydrat" + colDel
                    + "protein" + colDel + "fiber");

            if (document.hasChildNodes()) {

                printNodeList(document.getChildNodes());

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private static void printNodeList(NodeList nodeList) {

        for (int count = 0; count < nodeList.getLength(); count++) {

            Node elemNode = nodeList.item(count);

            if (elemNode.getNodeType() == Node.ELEMENT_NODE) {

                if (elemNode.hasAttributes()) {

                    NamedNodeMap nodeMap = elemNode.getAttributes();

                    for (int i = 0; i < nodeMap.getLength(); i++) {

                        Node node = nodeMap.item(i);

                        System.out.print("\n " + node.getNodeValue());
                    }
                }

                if (hasChildElements((Element) elemNode)) {
                    if (!elemNode.getNodeName().equals("review")) {
                        printNodeList(elemNode.getChildNodes());
                        countX++;
                    }
                } else {
                    System.out.print(colDel + elemNode.getTextContent() + " ");
                }
            }

        }
    }

    public static boolean hasChildElements(Element el) {

        NodeList children = el.getChildNodes();

        for (int i = 0; i < children.getLength(); i++) {

            if (children.item(i).getNodeType() == Node.ELEMENT_NODE) {

                return true;
            }

        }

        return false;
    }

    /**
     * Clear the console before printing the options menu. For windows executes
     * command line "cls" else (Unix) the command line : "clear"
     */
    static final void clearConsole() {

        ProcessBuilder commandLineExecutor = new ProcessBuilder();

        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                commandLineExecutor.command("cls").inheritIO().start().waitFor();
            } else {
                commandLineExecutor.command("clear").inheritIO().start().waitFor();
            }
        } catch (final Exception e) {
            System.out.println(e);
        }

    }

    /**
     * This method just for the development Phase. to notify the user if the Option
     * is not applicable
     */
    static private void inactiveOption() {
        clearConsole();
        System.out.println("This option is inactive now, Please choose another option from the list");
        printMenuOptions();
    }

}