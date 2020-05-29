package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {

    Scanner scanner= new Scanner(System.in);
    ArrayList<Customer> customers= new ArrayList<Customer>();


    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    private void create(){
        System.out.println("enter name");
        String name= scanner.next();
        System.out.println("enter amount");
        double amount= 100.00;
        ArrayList<Double> transitions= new ArrayList<Double>();
        transitions.add(amount);
        customers.add(new Customer(name, transitions));
    }

    private void print(){
        for (int i= 0; i<customers.size(); i++){
            System.out.println(customers.get(i));
            //System.out.println(customers.indexOf());
        }

    }

}
