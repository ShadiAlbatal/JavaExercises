package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    public Scanner scanner= new Scanner(System.in);

    private ArrayList<Contacts> contacts= new ArrayList<Contacts>();

    public MobilePhone() {
    }

    public  void add(){
        System.out.println("enter name");
        String nm= scanner.next();
        System.out.println("enter nr");
        int nr= scanner.nextInt();
        contacts.add(new Contacts(nm, nr));
    }

    public  void print(){
        for (int i=0; i<contacts.size(); i++){
            System.out.println("name: "+contacts.get(i).getName() + "     nr: " + contacts.get(i).getNr());
        }
    }

    public int find(){
        System.out.println("enter name");
        String nm= scanner.next();
        System.out.println("enter nr");
        int nr= scanner.nextInt();
        for (int i=0; i<contacts.size(); i++){
            String value= contacts.get(i).getName();
            System.out.println(value);
            if (/*name == value || */nr == contacts.get(i).getNr()){
                System.out.println("exists");
                return i;
            }
            else {
                System.out.println("not");
            }
        }
        return -1;
    }

//    public int findIndex(String name, String nr) {
//        for (int i=0; i<contacts.size(); i++){
//            //System.out.println(contacts.get(i).getName() + "    " + contacts.get(i).getNr());
//            String value= contacts.get(i).getName();
//            System.out.println(value);
//            if (/*name == value || */nr == contacts.get(i).getNr()){
//                System.out.println("exists");
//                return i;
//            }
//            else {
//                System.out.println("not");
//                return -1;
//            }
//        }
//    }

    public void modify(){
        int pos= find();
            if (find()>= 0) {
                System.out.println("enter new name");
                String newname= scanner.next();
                System.out.println("enter new nr");
                int newnr= scanner.nextInt();
                contacts.set(pos,new Contacts(newname,newnr));
                System.out.println("it has been modified to: " + newname + " : " + newnr);
            }
        }
}
