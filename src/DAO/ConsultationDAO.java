/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Docteur;
import Entities.Specialite;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
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

//        // (1) Noms de toutes les spécialités
//        Criteria criteria = session.createCriteria(Specialite.class);
//        List<Specialite> results = criteria.list();
//        for(Specialite specialite : results){
//            System.out.println("Titre specialite :" +specialite.getTitre());
//        }

//        // (2) Nombre de docteurs ayant une spécialité.
//        Criteria criteria = session.createCriteria(Specialite.class);
//        criteria.setProjection(Projections.countDistinct("docteurs"));
//        long result = (long)criteria.uniqueResult();
//        System.out.println("Nombre de docteurs : " +result);

//        // (3) Nombre de docteurs au total, avec ou sans spécialité
//        Criteria criteria = session.createCriteria(Docteur.class);
//        criteria.setProjection(Projections.countDistinct("matricule"));
//        long result = (long)criteria.uniqueResult();
//        System.out.println("Nombre de docteurs : " +result);

        // (4) Nombre de docteurs par spécialité
        // .CreateAlias("products", "p", NHibernate.SqlCommand.JoinType.LeftOuterJoin)
        Criteria criteria = session.createCriteria(Docteur.class);
        ProjectionList pList = Projections.projectionList();
        pList.add(Projections.count("matricule"));
        pList.add(Projections.groupProperty("specialite.code"));
        criteria.setProjection(pList);
        List<Object[]> result = (List)criteria.list();
        for(Object[] object : result){
            System.out.println("Nombre de docteurs : " + object[0]);
            System.out.println("Code de spécialité : " + object[1]);
            System.out.println("********");
        }
        

    }

}
