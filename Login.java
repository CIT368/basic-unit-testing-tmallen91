import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Login {
    public static void main (String args[]) throws SQLException, NullPointerException
    {
        Connection sqlcon = null;
        try {
        sqlcon = EstablishConnection();
        System.out.println("CONNECTION SUCCESSFUL");
        } catch (Exception c){
            System.out.println(c);
            System.out.println("DRIVER NOT FOUND, TRAVIS!");
        }finally {
            try {
                sqlcon.close();
            } catch (SQLException x) {
                System.out.println(x);
            }
        } 
    }

    private static Connection EstablishConnection() throws SQLException {
        final String dbConnection = "jdbc:sqlserver://cit368-db.cw80ybsmsrap.us-east-2.rds.amazonaws.com;" +  
        "databaseName=TODOAPP;user=admin;password=w57Zl9ERUCTzOYpGJTCf"; //CIT_368_Admin; 2xsgLkRELY0whNA2SnBR"
        return DriverManager.getConnection(dbConnection);
    }
}