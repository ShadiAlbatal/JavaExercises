package com.company;

import java.util.Scanner;

public class NewToDo extends ToDoList {

    private String content;
    private Scanner s= new Scanner(System.in);


    @Override
    public void newToDoList() {
        this.content= s.next();
        System.out.println(content);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }


}
