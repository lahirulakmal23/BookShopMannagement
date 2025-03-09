package BookShopPackage;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class BookControl {
    private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static boolean insertData(String name, String price, String catergory, String quantity, String description) {
        isSuccess = false;

        try {
            // Get the connection
            con = DB_Connection.getConnection();
            stmt = con.createStatement();

            // SQL insert statement
            String sql = "INSERT INTO book VALUES (0, '" + name + "', '" + price + "', '" + catergory + "', " + quantity + ", '" + description + "')";

            // Execute the SQL statement
            int rowsAffected = stmt.executeUpdate(sql);

            // Check if the insertion was successful
            if (rowsAffected > 0) {
                isSuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return isSuccess;
    }
}
