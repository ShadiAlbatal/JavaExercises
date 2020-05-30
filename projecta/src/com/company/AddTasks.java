package com.company;

import org.supercsv.io.CsvListWriter;
import org.supercsv.io.ICsvListWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AddTasks {

    private Scanner scanner= new Scanner(System.in);

    final String [][] task= new String[1][4];


    private ToDo toDo(){
        return new ToDo();
    }


    public void takeInput() throws IOException {

        System.out.println("set title");
        task[0][0]= scanner.next();
        System.out.println("set date");
        task[0][1]= scanner.next();
        System.out.println("set project");
        task[0][2]= scanner.next();

        appendInputs(task);
    }

    private void appendInputs(String[][] task) throws IOException {
        ICsvListWriter csvListWriter= null;
        try {
            FileWriter fileWriter= new FileWriter(toDo().theFile(), true);
            csvListWriter= new CsvListWriter(fileWriter, CsvPreference.STANDARD_PREFERENCE);

            for (int i=0; i< task.length; i++){
                csvListWriter.write(task[i]);
            }
            fileWriter.write("\n");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("oops");
        }
        finally {
            try {
                csvListWriter.close();
                System.out.println("successfly added the task to the todo list");
            }
            catch (IOException e){
                System.out.println("something accor, could not add task");
                e.printStackTrace();

            }
        }
    }
}
