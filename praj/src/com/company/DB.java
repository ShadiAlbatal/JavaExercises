package com.company;

public interface DB {

    // JDBC driver name and database URL
    String jdbc_driver= "com.mysql.cj.jdbc.Driver";
    String db_url= "jdbc:mysql://localhost:3306";

    //  Database credentials
    String user= "root";
    String pass= "shadi";

    // Database info
    String dbName= "TODO";
    String TableName= "TODO_List";

    //getters
    String getJdbc_driver();
    String getDb_url();
    String getUser();
    String getPass();
    String getDbName();
    String getTableName();



}