package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {

    private Scanner scanner= new Scanner(System.in);
    private String title;
    private ArrayList<String> checklist= new ArrayList<String>();

    public ToDo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        System.out.println("add project name");
        this.title = scanner.next();
    }

    public void add(){
        boolean flag= true;
        String item;
        while (flag){
            System.out.println("i to add new item or 000 to exit");
            item= scanner.next();
            switch (item){
                case "000":
                    flag= false;
                    break;
                case "i":
                    System.out.println("add task");
                    item = scanner.next();
                    this.checklist.add(item);
                    break;
            }
        }
    }
    public void show(){
//        System.out.println("size");
//        System.out.println(this.checklist.size());
            if (this.checklist.size()==0){
                System.out.println("you have no tasks, yaay");
            }
            else {
                System.out.println("your tasks");
                for (int i=0; i<this.checklist.size(); i++){
                    System.out.println("    *"+this.checklist.get(i));
                }
            }


    }


}