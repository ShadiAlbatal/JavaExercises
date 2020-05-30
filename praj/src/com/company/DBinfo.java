package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinfo implements DB{

    public DBinfo() throws SQLException {
    }


    @Override
    public String getJdbc_driver() {
        return jdbc_driver;

    }

    @Override
    public String getDb_url() {
        return db_url;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public String getDbName() {
        return dbName;
    }

    @Override
    public String getTableName() {
        return TableName;
    }

    // Create connection and statement
    final private Connection connection= DriverManager.getConnection(getDb_url(),getUser(),getPass());
    final private Statement statement= connection.createStatement();

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void useDB(){
        try {
            // switching to the db
            System.out.println("switching db to: " + dbName);
            String useDbQuery= "use " + dbName;
            getStatement().executeUpdate(useDbQuery);
            System.out.println("Switched to "+ dbName + " ALHAMDuLLAH");

        }
        catch (Exception c){
            c.printStackTrace();
        }
    }
}
