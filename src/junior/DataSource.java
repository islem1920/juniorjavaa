/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junior;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DataSource {
    private static DataSource instance ;
    private final String Url="jdbc:mysql://localhost:3306/junior";
    private final String LOGIN= "root";
    private final String PWD="";

    public String getUrl() {
        return Url;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public String getPWD() {
        return PWD;
    }

    public Connection getCnx() {
        return cnx;
    }
            
    private Connection cnx;
    
    private DataSource(){
    
        try {
            cnx = DriverManager.getConnection(Url, LOGIN, PWD);
            System.out.println("Connexion effective !");   
                    
                    
                    
                    } catch (SQLException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    public  static DataSource getInstance(){
    if(instance == null)
    instance = new DataSource();
    
    return instance;
    
    }
    
}