package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        BankAccount account0= new BankAccount();
        BankAccount account1 = new BankAccount(1,50, "ds", "sada", 432434234);
        BankAccount account2= new BankAccount(1, "adadadfdjfjds@", 3232323);
        account1.deposite(50);
        System.out.println(account1.getBalance());

        if(account1.withdraw(150) == -1) {
            System.out.println("Not enough money");
        }


        account1.fullInfo();
        account0.fullInfo();


        System.out.println(account1.getName() + account1.getAccountNumber() + account1.getBalance() +  account1.getEmail() + account1.getPhoneNumber());
    }


}
