package tr.edu.hacettepe.bbm490;

/**
 * Created by mertcaliskan
 * on 08/12/14.
 */

import java.sql.*;


public class Test {

    public static void main(String args[]) throws SQLException {
        Driver myDriver = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver( myDriver );

        String url = "jdbc:oracle:thin:@localhost:1521/ORCL";
        Connection conn = DriverManager.getConnection(url, "BUWORKSHOP", "BUWORKSHOP");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Users");
        while (rs.next()) {
            String userid = rs.getString(1);
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String password = rs.getString(4);
            int type = rs.getInt(5);
            System.out.println(userid + ", " + firstname + ", " + lastname + ", " + password + ", " + type);
        }

        // Cleanup
        rs.close(); stmt.close(); conn.close();
    }
}
