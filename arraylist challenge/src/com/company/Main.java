package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Contacts d= Contacts.createContacts("BsmAlllah",111111111);

        MobilePhone mobilePhone= new MobilePhone();

//        mobilePhone.add();
//        mobilePhone.add();
//        mobilePhone.add();
//        mobilePhone.print();
//        mobilePhone.find();
//        mobilePhone.modify();
//        mobilePhone.print();
//        mobilePhone.find();
//        mobilePhone.print();

        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        ArrayList<Double> arrayList1= new ArrayList<Double>();


        for (int i=0; i<=10; i++){
            arrayList.add(i);
            System.out.println(arrayList.indexOf(i));
        }

        for (int i=0; i<=10; i++){
            arrayList.add(Integer.valueOf(i));
            System.out.println(arrayList.get(i).valueOf(i));
        }

    }

}
