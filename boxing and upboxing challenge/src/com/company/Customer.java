package com.company;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> ThetransitionList= new ArrayList<Double>();


    public Customer(String name, ArrayList<Double> transitions) {
        this.name = name;
        this.ThetransitionList = transitions;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> ThetransitionList() {
        return ThetransitionList;
    }
}
