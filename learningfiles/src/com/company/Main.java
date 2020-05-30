package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

        public static void main(String[] args) {
            File myObj = new File("todo.txt");

            if (myObj.exists()) {
                try {
                    FileWriter myWriter = new FileWriter("D:FileHandlingNewFilef1.txt");
                    // Writes this content into the specified file
                    myWriter.write("Java is the prominent programming language of the millenium!");

// Closing is necessary to retrieve the resources allocated
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            } else {
                try {
// Creating an object of a file
                    if (myObj.createNewFile()) {
                        System.out.println("File created: " + myObj.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        }
    }
