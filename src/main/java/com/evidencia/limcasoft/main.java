package com.evidencia.limcasoft;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException, SQLException {
        String user = "root";
        String password = ""; 
        String url = "jdbc:mysql://127.0.0.1:3306/db";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

    }
}
