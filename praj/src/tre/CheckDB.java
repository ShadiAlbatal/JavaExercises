//package com.company;
//
//import java.sql.*;
//
//public class CheckDB {
//
//    DBinfo infoDB= new DBinfo();
//
//    private Statement statement = null;
//    private Connection connection = null;
//
//    public CheckDB() throws SQLException {
//    }
//
//    public void dbCheck() throws SQLException {
//
//        // Create connection and statement
//        Connection connection= DriverManager.getConnection(infoDB.getDb_url(),infoDB.getUser(),infoDB.getPass());
//        Statement statement= connection.createStatement();
//
//        String db= infoDB.getDbName();
//        String tb= "books";
//
//        String ch= "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = '" + db + "';";
//        String h= "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = 'YaRaaaab';";
//        String f= "CREATE DATABASE IF NOT EXISTS " + db + ";";
//        //String ch= "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = '" + db + "' AND table_name = '" + tb + "';";
//        System.out.println(ch);
//
//        ResultSet rs = statement.executeQuery(ch);
//        rs.next();
//        if (rs.getInt("COUNT(*)") <= 0){
//            System.out.println("LLAH ALHAMD");
//
//        }
////        System.out.println(ck);
////        System.out.println(c);
//
//
//
//
//
//
//    }//check end
//
//
//}//class end
