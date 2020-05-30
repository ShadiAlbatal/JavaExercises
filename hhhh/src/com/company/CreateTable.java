package com.company;
import java.sql.*;

public class CreateTable {

    private CreateDB createDB= new CreateDB();
    private CheckDB checkDB= new CheckDB();

    private String tableName= "Surah";

    public CreateTable() throws SQLException {
    }

    public String getTableName() {
        return tableName;
    }

    public String getdbName() {
        return checkDB.getDbName();
    }

    public void TableCreate() throws SQLException {
        CreateDB createDB= new CreateDB();
        CheckDB checkDB= new CheckDB();
            createDB.create();
            String dbName= getdbName();
            //String db= "ebookshop;";
            String sqlCreate= "use " + dbName;

            String sqlCC= "CREATE TABLE IF NOT EXISTS tasks (\n" +
                    "   id int,\n" +
                    "   title varchar(50),\n" +
                    "   price float,\n" +
                    "   primary key (id));";



            String ss= "INSERT INTO tasks(id, title) VALUES (3,'ff');";

            Connection connection= DriverManager.getConnection(checkDB.getDb_url(), checkDB.getUser(), checkDB.getPass());
            Statement statement= connection.createStatement();

            statement.execute(sqlCreate);
//            //statement.execute(sqlC);
            statement.execute(sqlCC);
//            statement.execute(sqlCreate2);
//            statement.execute(s);
            statement.execute(ss);

    }

}
