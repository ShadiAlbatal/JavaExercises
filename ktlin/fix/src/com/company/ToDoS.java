package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoS {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<ToDo> toDos= new ArrayList<ToDo>();

//    public void more(){
//        System.out.println("this metohd from stodos, called more, adds new lists to a program");
//        boolean flag= true;
//        ToDo toDo= new ToDo();
//        String ch;
//        while (flag){
//            System.out.println("n vs b");
//            ch= scanner.next();
//            switch (ch){
//                case "n":
//                    System.out.println("new checklist");
//                    toDo.add();
//                    toDos.add(toDo);
//                    break;
//                case "b":
//                    flag= false;
//                    break;
//            }
//        }
//    }
//
//    public void see(){
//        System.out.println("list the todos");
//        System.out.println(toDos.size());
//        for (int i=0; i<toDos.size(); i++){
//            toDos.get(i).show();
//        }
//    }

    public void addtitle(){

    }
    public void srttitle(){
        for (int i=0; i<toDos.size(); i++){
            System.out.println(toDos.get(i));
        }
    }

    public void add(){
        System.out.println("this metohd from todos, called add, adds new items to a list");
        boolean flag= true;
        String item;
        while (flag){
            System.out.println("c to create new list vs 000 to exit");
            item= scanner.next();
            switch (item){
                case "000":
                    flag= false;
                    break;
                case "c":
                ToDo toDo= new ToDo();
                toDo.setTitle();
                toDo.add();
                this.toDos.add(toDo);
                break;
            }
        }
    }

    public void show(){
        if (toDos.size()>= 0){
            System.out.println("you have no prjects, alhamduLLAH");
        }
        else {
            System.out.println("your projects:");
            for (int i=0; i< toDos.size(); i++){
                System.out.println("-" + toDos.get(i).getTitle());
                toDos.get(i).show();
            }
        }
    }

}