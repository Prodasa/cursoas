package modelo;
// Generated 25/10/2017 08:09:13 by Hibernate Tools 4.3.1



/**
 * Cursopalestrante generated by hbm2java
 */
public class Cursopalestrante  implements java.io.Serializable {


     private int id;
     private Integer idcurso;
     private Integer idpalestrante;

    public Cursopalestrante() {
    }

	
    public Cursopalestrante(int id) {
        this.id = id;
    }
    public Cursopalestrante(int id, Integer idcurso, Integer idpalestrante) {
       this.id = id;
       this.idcurso = idcurso;
       this.idpalestrante = idpalestrante;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getIdcurso() {
        return this.idcurso;
    }
    
    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }
    public Integer getIdpalestrante() {
        return this.idpalestrante;
    }
    
    public void setIdpalestrante(Integer idpalestrante) {
        this.idpalestrante = idpalestrante;
    }




}


