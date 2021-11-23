import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class onlineStore {
    public static void main(String[] args) {
        java.sql.Connection connection = null;
        try
        {

            // use the DriverManager to create
            // a Connection object
            String dbUrl =
                    "jdbc:mysql://localhost:3306/db";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(
                    dbUrl, username, password);
            System.out.println("It is connected !");
        }
        catch(SQLException e)
        {
            for (Throwable t : e)
                t.printStackTrace();
        }
//mysql-connector-java-5.1.40.jar//
    }


}
