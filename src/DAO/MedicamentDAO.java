package DAO;

import Entities.Consultation;
import Entities.Docteur;
import Entities.Medicament;
import Entities.Ordonnance;
import Entities.Ordonnancemedicaments;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import projetfinsessiona10gr233.HibernateUtil;

public class MedicamentDAO {

    static Session session = null;

    public static void nbMedicamentsParDocteur() {

        session = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = session.createCriteria(Medicament.class, "m")
                .createCriteria("ordonnancemedicamentses")
                .createCriteria("ordonnance")
                .createCriteria("consultations")
                .createCriteria("docteur", "d");
        ProjectionList pList = Projections.projectionList();
        pList.add(Projections.countDistinct("m.idmed"));
        pList.add(Projections.groupProperty("d.matricule"));
        pList.add(Projections.groupProperty("d.prenomm"));
        pList.add(Projections.groupProperty("d.nomm"));
        criteria.setProjection(pList);
        List<Object[]> result = (List)criteria.list();
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Afficher le nombre de médicaments prescrits par docteur          ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(Object[] object : result){
            System.out.println("Nombre de médicaments : " +object[0]);
            System.out.println("Matricule du docteur  : " +object[1]);
            System.out.println("Prenom du docteur     : " +object[2]);
            System.out.println("Nom du docteur        : " +object[3]);
            System.out.println(" //////////////////////////////////////");
        }

        session.close();
        
        


    }

}
