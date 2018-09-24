package Entities;
// Generated 2018-09-24 15:15:24 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ordonnance generated by hbm2java
 */
public class Ordonnance  implements java.io.Serializable {


     private long numord;
     private String recommandations;
     private String typeo;
     private Date datec;
     private Set ordonnancemedicamentses = new HashSet(0);
     private Set consultations = new HashSet(0);
     private Set ordonnancechirurgies = new HashSet(0);

    public Ordonnance() {
    }

	
    public Ordonnance(long numord) {
        this.numord = numord;
    }
    public Ordonnance(long numord, String recommandations, String typeo, Date datec, Set ordonnancemedicamentses, Set consultations, Set ordonnancechirurgies) {
       this.numord = numord;
       this.recommandations = recommandations;
       this.typeo = typeo;
       this.datec = datec;
       this.ordonnancemedicamentses = ordonnancemedicamentses;
       this.consultations = consultations;
       this.ordonnancechirurgies = ordonnancechirurgies;
    }
   
    public long getNumord() {
        return this.numord;
    }
    
    public void setNumord(long numord) {
        this.numord = numord;
    }
    public String getRecommandations() {
        return this.recommandations;
    }
    
    public void setRecommandations(String recommandations) {
        this.recommandations = recommandations;
    }
    public String getTypeo() {
        return this.typeo;
    }
    
    public void setTypeo(String typeo) {
        this.typeo = typeo;
    }
    public Date getDatec() {
        return this.datec;
    }
    
    public void setDatec(Date datec) {
        this.datec = datec;
    }
    public Set getOrdonnancemedicamentses() {
        return this.ordonnancemedicamentses;
    }
    
    public void setOrdonnancemedicamentses(Set ordonnancemedicamentses) {
        this.ordonnancemedicamentses = ordonnancemedicamentses;
    }
    public Set getConsultations() {
        return this.consultations;
    }
    
    public void setConsultations(Set consultations) {
        this.consultations = consultations;
    }
    public Set getOrdonnancechirurgies() {
        return this.ordonnancechirurgies;
    }
    
    public void setOrdonnancechirurgies(Set ordonnancechirurgies) {
        this.ordonnancechirurgies = ordonnancechirurgies;
    }




}


