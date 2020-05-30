package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToDoS toDoS= new ToDoS();


        Scanner scanner = new Scanner(System.in);
        boolean flag= true;
        String ch;
        while (flag){
            System.out.println("n for new todolist vs v to view your todos");
            ch= scanner.next();
            switch (ch){
                case "v":
                    toDoS.show();
                    break;
                case "n":
                    toDoS.add();
                    break;

            }
        }

    }
}
