package BookShopPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    private static String url = "jdbc:mysql://localhost:3306/bookshop?useSSL=false&serverTimezone=UTC";
    private static String user = "root";
    private static String pass = "2002";
    private static Connection con;

    public static Connection getConnection() {
        System.out.println("Connected");

        try {
            System.out.println("test1");

            Class.forName("com.mysql.cj.jdbc.Driver"); // ✅ Fixed class name
            System.out.println("test2");

            con = DriverManager.getConnection(url, user, pass);
            System.out.println("test3");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
