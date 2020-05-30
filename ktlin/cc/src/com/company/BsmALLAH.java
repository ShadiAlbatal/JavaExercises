package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BsmALLAH {

    private Connection conn;
    private Statement statement;
    //String jdbc_driver= "com.mysql.cj.jdbc.Driver";
    //String db_url= "jdbc:mysql://localhost:3306";
    //String db_url= "jdbc:mysql://localhost:3306/?useUnicode=true&amp;amp;amp;useJDBCCompliantTimezoneShift=true&amp;amp;amp;useLegacyDatetimeCode=false&amp;amp;amp;serverTimezone=UTC";

    public void openConnection() throws SQLException{

        String url= "jdbc:mysql://localhost/";
        String db= "mysql";
        String driver= "com.mysql.jdbc.Driver";

        //  Database credentials
        String user= "root";
        String pass= "shadi";

        try {
            Class.forName(driver);
            this.conn= (Connection) DriverManager.getConnection(url+db,user,pass);

            System.out.println("ALLAH u AKBAR");
        }
        catch (ClassNotFoundException | SQLException sqle){
            System.out.println("La houl wla quta ila bi ALLAH");
        }
    }



}
