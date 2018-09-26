/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Consultation;
import Entities.ConsultationId;
import Entities.Docteur;
import Entities.Specialite;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.sql.JoinType;
import projetfinsessiona10gr233.HibernateUtil;

/**
 *
 * @author 1895040
 */
public class ConsultationDAO {

    static Session session = null;

    public static void nbConsultationsParAnnee() {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select count(*), EXTRACT(YEAR FROM ordonnance.datec) "
                + "from Consultation "
                + "group by EXTRACT(YEAR FROM ordonnance.datec)");

        List<Object[]> results = query.list();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Afficher le nombre de consultations par année                    ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (Object[] ligneOrd : results) {
            System.out.println(" L'année des consultations : " + ligneOrd[1]);
            System.out.println(" Le nombre de consultation : " + ligneOrd[0]);

            System.out.println(" //////////////////////////////////////");
        }
        session.close();
    }

    public static void nbConsultationsParSpecialite() {
        session = HibernateUtil.getSessionFactory().openSession();
      
        Criteria criteria = session.createCriteria(Consultation.class);
        criteria.createAlias("docteur", "doc");
        criteria.createAlias("docteur.specialite", "spec", JoinType.LEFT_OUTER_JOIN);
        ProjectionList pList = Projections.projectionList();
        pList.add(Projections.rowCount());
        pList.add(Projections.groupProperty("spec.titre"));
        criteria.setProjection(pList);
        List<Object[]> result = (List)criteria.list();
        for(Object[] object : result){
            System.out.println("Nombre de consultations : " + object[0]);
            System.out.println("Titre de spécialité     : " + (object[1] != null ? object[1] : "[aucune specialité]") );
            System.out.println("********");
        }
        
        session.close();
        
        

    }

}
