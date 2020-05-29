package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts{

    private String name;
    private int nr;

    public static Scanner scanner= new Scanner(System.in);


    public Contacts(String name, int nr) {
        this.name = name;
        this.nr = nr;
    }

    public static Contacts createContacts(String name, int nr){
        return new Contacts(name, nr);
    }

    public String getName() {
        return name;
    }

    public int getNr() {
        return nr;
    }
}
