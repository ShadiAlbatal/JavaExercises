package com.company;

import javax.xml.namespace.QName;

public class VIPCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VIPCustomer() {
        this("default name", 5000, "default email");

    }

    public VIPCustomer(String name, String email) {
        this(name, 99, email);

    }

    public VIPCustomer(String name, int creditLimit, String email) {
        this.name= name;
        this.creditLimit= creditLimit;
        this.email= email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
