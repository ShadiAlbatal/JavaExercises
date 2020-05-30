package com.company;

import java.sql.*;  // Using 'Connection', 'Statement' and 'ResultSet' classes in java.sql package

public class Main {

    public static void main (String[]args) throws SQLException {

        //CreateTable createTable= new CreateTable();

        //createTable.TableCreate();

        CheckDB checkDB= new CheckDB();
        checkDB.checkDB();


    }//end main
}
