package com.mphasisJava.MyDemoProject;
import java.sql.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 // Database URL, Username, Password
        String url = "jdbc:mysql://localhost:3306/mphasis_db"; // Change database name
        String user = "root";  // Change username
        String password = "Password@12";  // Change password

        // Query to fetch data
        String query = "SELECT * from book"; // Change table and columns

        try {
            // Load the MySQL JDBC Driver (for MySQL 8+, it's not needed)
//     Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create Statement
            Statement stmt = conn.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery(query);

            // Process the Result Set
            while (rs.next()) {
               System.out.println(" id : "+rs.getInt(1)+"  titile : "+rs.getString(2));
            }

            // Close Resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

