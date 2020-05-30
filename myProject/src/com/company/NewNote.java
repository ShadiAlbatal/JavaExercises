package com.company;

import java.util.Scanner;

public class NewNote extends Note{

    private String content;
    private Scanner s= new Scanner(System.in);


    public NewNote(int number, String title) {
        super(number, title);
    }

    @Override
    public void newNote() {
        this.content= s.next();
        System.out.println(content);
    }
}
