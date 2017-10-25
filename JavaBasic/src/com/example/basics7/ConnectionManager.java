package com.example.basics7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class ConnectionManager {

    private static String JDBC_URL = "jdbc:derby://localhost:1527/sample;user=app;password=app1";

    private ConnectionManager() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            System.out.println("ConnectionManager has been loaded...");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DerbyConnectionTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL);
    }

}
