package com.company;

public class Main {

    public static void main(String[] args) {

 //        this("default name", 5000, "default email");
        VIPCustomer vipCustomer3= new VIPCustomer();
 //        this(name, 99, email);
        VIPCustomer vipCustomer2= new VIPCustomer("sd", "ALHMADuLLAH@ALHAMDuLLAH");
        
        VIPCustomer vipCustomer1= new VIPCustomer("huvud", 3, "BsmALLAH@BsmALLAH");

        System.out.println(vipCustomer1.getName() +vipCustomer1.getCreditLimit() + vipCustomer1.getEmail());

        System.out.println(vipCustomer2.getName() +vipCustomer2.getCreditLimit() + vipCustomer2.getEmail());

        System.out.println(vipCustomer3.getName() +vipCustomer3.getCreditLimit() + vipCustomer3.getEmail());

    }
}
