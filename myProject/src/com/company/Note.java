package com.company;

import java.util.Scanner;

public class Note {

    private int number;
    private String title;

    private Scanner s= new Scanner(System.in);

    public Note(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public void newNote(){
        System.out.println("new note");

    }

}
