package com.dovlet;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// write your code here
        // Step 1: Load driver
        //Class.forName("jdbc:mysql://localhost");

        // Step 2: Create connection object
        String url = "jdbc:mysql://localhost:3306/revature";
        String username = "root";
        String password = "myPassword";
        Connection connection =  DriverManager.getConnection(url, username, password);

        // Step 3: create statement object
        Statement statement =  connection.createStatement();

        // Step 4: Execute Query
        String sql = "select * from employee";
        ResultSet resultSet =  statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println("Id: "+ resultSet.getInt(1)+", Name: "+ resultSet.getString(2)+
                    ", Email: "+ resultSet.getString(3));
        }

        // Step 5: close the connection
        connection.close();
    }
}
