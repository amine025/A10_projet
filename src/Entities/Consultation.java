package Entities;
// Generated 2018-09-24 15:15:24 by Hibernate Tools 4.3.1



/**
 * Consultation generated by hbm2java
 */
public class Consultation  implements java.io.Serializable {


     private ConsultationId id;
     private Ordonnance ordonnance;
     private Docteur docteur;
     private String diagonastic;

    public Consultation() {
    }

	
    public Consultation(ConsultationId id, Docteur docteur) {
        this.id = id;
        this.docteur = docteur;
    }
    public Consultation(ConsultationId id, Ordonnance ordonnance, Docteur docteur, String diagonastic) {
       this.id = id;
       this.ordonnance = ordonnance;
       this.docteur = docteur;
       this.diagonastic = diagonastic;
    }
   
    public ConsultationId getId() {
        return this.id;
    }
    
    public void setId(ConsultationId id) {
        this.id = id;
    }
    public Ordonnance getOrdonnance() {
        return this.ordonnance;
    }
    
    public void setOrdonnance(Ordonnance ordonnance) {
        this.ordonnance = ordonnance;
    }
    public Docteur getDocteur() {
        return this.docteur;
    }
    
    public void setDocteur(Docteur docteur) {
        this.docteur = docteur;
    }
    public String getDiagonastic() {
        return this.diagonastic;
    }
    
    public void setDiagonastic(String diagonastic) {
        this.diagonastic = diagonastic;
    }




}

