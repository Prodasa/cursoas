package modelo;
// Generated 25/10/2017 08:09:13 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Curso generated by hbm2java
 */
public class Curso  implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_curso_id")
     private int id;
     private String nome;
     private Date datainicio;
     private Date datafim;
     private Double valorcurso;

    public Curso() {
    }

    public Curso(String nome, Date datainicio, Double valorcurso, Date datafim) {
        this.nome = nome;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.valorcurso = valorcurso;
    }
	
    public Curso(int id) {
        this.id = id;
    }
    public Curso(int id, String nome, Date datainicio, Date datafim, Double valorcurso) {
       this.id = id;
       this.nome = nome;
       this.datainicio = datainicio;
       this.datafim = datafim;
       this.valorcurso = valorcurso;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDatainicio() {
        return this.datainicio;
    }
    
    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }
    public Date getDatafim() {
        return this.datafim;
    }
    
    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }
    public Double getValorcurso() {
        return this.valorcurso;
    }
    
    public void setValorcurso(Double valorcurso) {
        this.valorcurso = valorcurso;
    }




}


