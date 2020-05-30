package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadTasks {

    private Scanner scanner= new Scanner(System.in);

    private ToDo toDo(){
        return new ToDo();
    }



    public void readTasks() throws IOException {

        String line= "";
        String csvSpliter= ",";

        boolean flag= true;
        while (flag){
            try {
                FileReader fileReader= new FileReader(toDo().theFile());
                BufferedReader bufferedReader= new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null){
                    String[] task= line.split(csvSpliter);

                    System.out.println(">> sorting menu\n" +
                            ">> Pick an option:\n" +
                            ">> (1) Show Task List by date\n" +
                            ">> (2) Show Task List by project");
                    int ch= scanner.nextInt();
                    switch (ch){
                        case 1:
                            System.out.println("Enter the desired date");
                            if (task[1].contains(scanner.next())){
                                System.out.println("found date");

                                System.out.println("title: "+task[0] +"\ndate: "+ task[1] + "\nproject: " + task[2]);
                            }
                            break;
                        case 2:
                            System.out.println("Enter the name project to search");
                            if (task[2].contains(scanner.next())){
                                System.out.println("found proj");
                                System.out.println("title: "+task[0] +"\ndate: "+ task[1] + "\nproject: " + task[2]);
                            }
                            break;
                        case 3:
                            System.out.println("going to main menu");
                            flag= false;
                            break;
//                        case 4:
//                            for (int i=0; i<values.length; i++){
//                                for (int j=0; j<values[i].length; j++){
//                                    System.out.println(values[i][j]);
//                                }
//                                System.out.println("-----");
//                            }
                    }

                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//
//        ArrayList<String> task= new ArrayList<String>();
//        FileReader fileReader= new FileReader(toDo().theFile());
//        BufferedReader bufferedReader= new BufferedReader(fileReader);
//
//        String line= "";
//
//        while ((line = bufferedReader.readLine()) != null) {
//            for (int i = 0; i < task.size(); i++) {
//                System.out.println(task.get(0));
//            }
//        }
        }
}
//    // Parse the data
//    String[][] values = CSVParser.parse(
//            new StringReader(
//                    "hello,world\n" +
//                            "how,are,you"
//            )
//    );
//
//// Display the parsed data
//        for (int i=0; i<values.length; i++){
//        for (int j=0; j<values[i].length; j++){
//        System.out.println(values[i][j]);
//        }
//        System.out.println("-----");
//        }