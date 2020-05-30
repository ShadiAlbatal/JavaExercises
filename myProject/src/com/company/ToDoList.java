package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private String title;
    private boolean done;
    private CheckList content;

    private ArrayList<CheckList> checkLists= new ArrayList<CheckList>();

    private Scanner s= new Scanner(System.in);

    public ToDoList() {
    }

    public ToDoList(String title, boolean done) {
        this.title = title;
        this.done = done;
    }


    public void setTitle(String title) {
        System.out.println("set title");
    }

    public boolean isDone() {
        return done;
    }

    public void newToDoList(){
        System.out.println("new checklist");
    }

    public class CheckList{

        private String bullet= "* ";
        private int nr;
        private String list;
        private String cont;

        public void checkList(){
            System.out.println(this.bullet + this.cont);
        }
    }

}
