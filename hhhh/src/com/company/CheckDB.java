package com.company;

import javax.swing.*;
import java.sql.*;

public class CheckDB {


    // JDBC driver name and database URL
    private final String jdbc_driver= "com.mysql.jdbc.Driver";
    private final String db_url= "jdbc:mysql://localhost";

    private CreateTable createTable= new CreateTable();

    //  Database credentials
    private final String user= "root";
    private final String pass= "987753321";

    // Database info
    private String dbName= "SubhanALLAH";

    private Statement statement = null;
    private Connection connection = null;

    public CheckDB() throws SQLException {
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public String getJdbc_driver() {
        return jdbc_driver;
    }

    public String getDb_url() {
        return db_url;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }


    public String getDbName() {
        return dbName;
    }

        public void checkDB() throws SQLException {

            Connection connection= DriverManager.getConnection(db_url,user,pass);
            Statement statement= connection.createStatement();

            // Create connection and statement
            String ck= "SELECT COUNT(*)\n" +
                    "FROM information_schema.tables \n" +
                    "WHERE table_schema = 'dd' \n" +
                    "AND table_name = 'books';";

            String f= "show databases;";
            String db= getDbName();
            String tb= createTable.getTableName();
            //String ch= "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = '" + db + "' AND table_name = '" + tb + "';";

//            String ck= "SELECT COUNT(*)\n" +
//                    "FROM information_schema.tables \n" +
//                    "WHERE table_schema = '" + getDbName() + " ' " +
//                    "AND table_name = '" + createTable.getTableName() + " ' ;";

            ResultSet rs = statement.executeQuery(f);
            rs.next();
            if (rs.getInt("COUNT(*)") > 0){
                System.out.println("LLAH ALHAMD");
            }
            else {
                //CreateDB createDB= new CreateDB();
                //createDB.create();
            }

        }

}
