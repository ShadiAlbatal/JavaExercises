package com.company;

import java.sql.*;

public class CreateDB {
    private CheckDB checkDB= new CheckDB();

    public CreateDB() throws SQLException {
    }


    public void create()throws SQLException {

        try {
            //register JDBC driver
            Class.forName(checkDB.getJdbc_driver());
            System.out.println("connecting to the DB");

            //open connection
            Connection connection= DriverManager.getConnection(checkDB.getDb_url(),checkDB.getUser(),checkDB.getPass());


            // excute query
            System.out.println("creating the DB...");
            Statement statement= connection.createStatement();

            //creating the db
            String name= checkDB.getDbName();
            String query= "CREATE DATABASE " + name;
            statement.executeUpdate(query);
            System.out.println(name +" DB created successfully ...");
        }
        catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }
        catch (SQLException se){
            //handles jdbc errors
            se.printStackTrace();
        }
//        finally {
//            // close resources
//            try {
//                if (statement !=null){
//                    statement.close();
//                }
//            } catch (SQLException se1) {
//                se1.printStackTrace();
//            }
//            try {
//                if (connection != null){
//                    connection.close();
//                }
//            } catch (SQLException se2) {
//                se2.printStackTrace();
//            }
//        }
        System.out.println("ALHAMDuLLAH");
    }
}
