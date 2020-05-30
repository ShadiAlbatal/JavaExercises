package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;


    public BankAccount() {
        this(33 , 23, "default name", "default email", 43324);
        System.out.println("empty");
    }


    public BankAccount(int accountNumber, double balance, String name, String email, int phoneNumber) {
        System.out.println("first");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(double balance, String email, int phoneNumber) {
        this(7777, balance, "sdasdas",email, phoneNumber);
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double deposite(double deposite){
       return this.balance+= deposite;
    }


    public double withdraw(double withdraw){
        // if(withdraw<=balance){ return this.balance-=withdraw;} return -1;
        balance = balance - withdraw >= 0 ? balance - withdraw : balance;
        return -1;
    }

    public void fullInfo(){
        System.out.println("Name " + name + " accountnr " + accountNumber + " balance " + balance + " email " + email + " phonennr " + phoneNumber);
    }
}
