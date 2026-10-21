package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static Connection connect() throws SQLException {
        Connection connection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/practice_school", "root", "");
        return connection;
    }
}
