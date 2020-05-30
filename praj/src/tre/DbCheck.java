//package tre;
//
//import com.company.DB;
//
//import java.sql.*;
//
//public class DbCheck{
//
//
//
//    private Statement statement = null;
//    private Connection connection = null;
//
//    public void dbCheck() throws SQLException {
//
//        // Create connection and statement
//        Connection connection= DriverManager.getConnection(DBinfo.getDb_url(),DBinfo.getUser(),DBinfo.getPass());
//        Statement statement = connection.createStatement();
//
//
//        String db = getDbName();
//        String tb = "books";
//
//        String check = "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = '" + db + "' AND table_name = '" + tb + "';";
//        try {
//            ResultSet rs = statement.executeQuery(check);
//            rs.next();
//            if (rs.getInt("COUNT(*)") > 0) {
//                System.out.println("ALHAMDuLLAH");
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//
//        System.out.println(check);
//    }
//}
