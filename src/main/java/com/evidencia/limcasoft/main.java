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
        
        //Create
        statement.execute("INSERT INTO customers VALUES(NULL, \"Daniel\", \"Carvajal Perez\",\"ex@gmail.com\",\"calle 1 barrio abc\",\"31000000\",\"CC\",\"1020670000\");");
        //Update
        statement.execute("UPDATE customers SET name = \"Juan Carlos\", lastname = \"Lopez Soto\" WHERE ID = 1;");
        //Delete 
        statement.execute("DELETE FROM customers WHERE ID = 1;");
        //Read
        ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
        while (resultSet.next()) {
            System.out.println("\nRegistro #" + String.valueOf(resultSet.getInt("id")) + "\n" + "Nombre: " + resultSet.getString("name")
                    + " \nApellidos: " + resultSet.getString("lastname")
                    + " \nEmail: " + resultSet.getString("email")
                    + " \nDirección: " + resultSet.getString("address")
                    + " \nNúmero: " + resultSet.getString("number")
                    + " \nTipo documento: " + resultSet.getString("docType")
                    + " \nNúmero de documento: " + resultSet.getString("docNumber"));
        }
    }
}
