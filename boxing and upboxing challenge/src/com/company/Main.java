package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here


        /// 2 customers > branch1
        ArrayList<Double> t1= new ArrayList<Double>();
        t1.add(111111.0);
        t1.add(222222.0);
        Customer c1= new Customer("AbdALLAH", t1);

        ArrayList<Double> t2= new ArrayList<Double>();
        t2.add(111111.1111111);
        t2.add(222222.2222222);
        Customer c2= new Customer("LaIlahIlaALLAH", t2);


        ArrayList<Customer> customers1= new ArrayList<Customer>();
        customers1.add(c1);
        customers1.add(c2);

        Branch brancheFirst= new Branch(customers1);

        /// 3 customers > branch2
        ArrayList<Double> t3= new ArrayList<Double>();
        Customer c3= new Customer("AlhamduLLAH", t3);
        t3.add(23321.434343);
        t3.add(343434.5454545);
        t3.add(565656.34345435);

        ArrayList<Double> t4= new ArrayList<Double>();
        Customer c4= new Customer("ALLAhuAKBAR", t4);
        t4.add(848584.23424);
        t4.add(85858.55);
        t4.add(3434.4564);

        ArrayList<Double> t5= new ArrayList<Double>();
        Customer c5= new Customer("LLAhiLHMD", t5);
        t5.add(434.34);
        t5.add(5454.66);
        t5.add(3343.22);

        ArrayList<Customer> customers2= new ArrayList<Customer>();
        customers2.add(c3);
        customers2.add(c4);
        customers2.add(c5);
        Branch branchSecond= new Branch(customers2);

        // pranch array for brancheFirst and branchSecond
        ArrayList<Branch> branches= new ArrayList<Branch>();
        branches.add(brancheFirst);
        branches.add(branchSecond);

        Bank theBBanKK= new Bank(branches);

        System.out.println(theBBanKK.branches.size());

        System.out.println(brancheFirst.customers.size());
        System.out.println(branchSecond.customers.size());

        System.out.println(customers1.size());
        System.out.println(customers2.size());

        System.out.println(c1.getName());
        System.out.println(c1.ThetransitionList());

        for (int i=0; i<customers1.size(); i++){
            System.out.println(customers1.get(i).getName() + " " + customers1.get(i).ThetransitionList());
        }

        for (int i=0; i<customers2.size(); i++){
            System.out.println(customers2.get(i).getName() + " " + customers2.get(i).ThetransitionList());
        }

        System.out.println(c1.ThetransitionList().add(3434.43234324));

        System.out.println(c5.ThetransitionList().set(0,2322.11));

        for (int i=0; i<customers1.size(); i++){
            System.out.println(customers1.get(i).getName() + " " + customers1.get(i).ThetransitionList());
        }

        for (int i=0; i<customers2.size(); i++){
            System.out.println(customers2.get(i).getName() + " " + customers2.get(i).ThetransitionList());
        }

//        branch1_3.set(0, new Branch(c1));
//        branch1_3.set(1, new Branch(c2));
//        branch1_3.set(2, new Branch(c3));

//        ArrayList<Customer> c5= new ArrayList<Customer>();
//        ArrayList<Customer> c6= new ArrayList<Customer>();
//        ArrayList<Customer> c7= new ArrayList<Customer>();
//        ArrayList<Branch> branch5_7= new ArrayList<Branch>();
//
//        branch5_7.set(0, new Branch(c5));
//        branch5_7.set(1, new Branch(c6));
//        branch5_7.set(2, new Branch(c7));
//
//        Bank theBank= new Bank(branch1_3);
//        ArrayList<Bank> bank= new ArrayList<Bank>();
//        bank.add(0, new Bank(branch1_3));
//        bank.add(1, new Bank(branch5_7));




    }
}
