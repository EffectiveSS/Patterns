package com.template.structural.facade;

import java.sql.*;

public class Facade {
    public Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
        String username = "root";
        String password = "aUtomatically1d";
        String connectionURL = "jdbc:mysql://localhost:3306/tsql2012";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(connectionURL, username, password);
    }
}
