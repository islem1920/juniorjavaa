/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junior;

/**
 *
 * @author Lenovo
 */

    public class Classe {
    
    private int idcl;
    private int nbrenfcl; 
    private String nomclasse;
    private int idgr;
    
    
    public Classe(int idcl, int nbrenfcl,int idgr, String nomclasse) {
        this.idcl = idcl;
        this.nbrenfcl = nbrenfcl;
        this.nomclasse = nomclasse;
        this.idgr = idgr;
    }

    Classe(int i, String meg, String arbi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdcl() {
        return idcl;
    }

    public void setIdcl(int idcl) {
        this.idcl = idcl;
    }

    public int getNbrenfcl() {
        return nbrenfcl;
    }

    public void setNbrenfcl(int nbrenfcl) {
        this.nbrenfcl = nbrenfcl;
    }
      public int getidgr() {
        return idcl;
    }

    public void setidgr(int idcl) {
        this.idcl = idcl;
    }

    public String getNomclasse() {
        return nomclasse;
    }

    public void setNomclasse(String nomclasse) {
        this.nomclasse = nomclasse;
    }
   
    
    
 
}
    

