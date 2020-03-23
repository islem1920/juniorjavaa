/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junior;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author islem
 */
public class DataSource {
    private static DataSource instance;
    private Connection cnx;

    private final String URL = "jdbc:mysql://localhost:3308/junior";
    private final String LOGIN = "root";
    private final String PASSWORD = "";

    private DataSource() {
        try {
            cnx = (Connection) DriverManager.getConnection(URL, LOGIN, PASSWORD);
            System.out.println("Conncting !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }
    
}
