package com.template.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Facade {

    public Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
        String username = "root";
        String password = "password";
        String connectionURL = "jdbc:mysql://localhost:3306/database";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(connectionURL, username, password);
    }

}
