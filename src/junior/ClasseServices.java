/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junior;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class ClasseServices {
    
Connection cnx = DataSource.getInstance().getCnx();
    
    public void ajouter(Classe c){
       String req="insert into classe (idcl,nbrenfcl,idgr,nomclasse) values('"+c.getIdcl()+"','"+c.getNbrenfcl()+"','"+c.getidgr()+"','"+c.getNomclasse()+"');";
    
    try { 
        Statement st = cnx.createStatement() ;
        st.executeUpdate(req);
        System.err.println("Classe Ajoutee ...");
    
    }   catch (SQLException ex) {
            Logger.getLogger(ClasseServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
   
public void ajouter2 (Classe c){
   
    
    try{
         String req ="insert into classe (Idcl,nbrenfcl,idgr,nomclasse) values(?,?,?,?);";
        PreparedStatement pst = cnx.prepareStatement(req);
        pst.setInt(1,c.getIdcl());
        pst.setInt(2,c.getNbrenfcl());
        pst.setInt(3,c.getidgr());
        pst.setString(4,c.getNomclasse());
        pst.executeUpdate();
        System.err.println("Classe Ajoutee ...");
        
       
    
    }   catch (SQLException ex) {
            Logger.getLogger(ClasseServices.class.getName()).log(Level.SEVERE, null, ex);
        }
 }


 public List<Classe> afficher (){
       
       List<Classe> list = new ArrayList<>();
       String req ="select * from classe";
           
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
            Classe c = new Classe(rs.getInt(1),rs.getInt(2), rs.getInt(3), rs.getString(4));
             list.add(c);
            }
        } catch (SQLException ex) {
         Logger.getLogger(ClasseServices.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
       
       }
  public void supprimer (Classe C){
        String req="delete from classe where idcl=?";
        PreparedStatement pst;
         
        try {
            pst = cnx.prepareStatement(req);
             pst.setInt(1,C.getIdcl());
             System.out.println("personne supprimer");
             pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClasseServices.class.getName()).log(Level.SEVERE, null, ex);
        } 
}

  
    public void modifier(Classe C) {
        try {
            String requete = "UPDATE Classe SET Nbrenfcl=?,idgr=?,Nomclasse=? WHERE Idcl=?";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(4, C.getIdcl());
            pst.setInt(1, C.getNbrenfcl());
            pst.setInt(2, C.getidgr());
            pst.setString(3, C.getNomclasse());
            pst.executeUpdate();
            System.out.println("Classe modifiée !");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}

