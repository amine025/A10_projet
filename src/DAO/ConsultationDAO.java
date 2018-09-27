package DAO;

import Entities.Consultation;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.sql.JoinType;
import app.HibernateUtil;
//
// TEAM 2 :
//
// CIAMPA, Gian Gabriele
// GHODBANE, Mohammed El Amine
// TARHOUNI, Mohamed Amine
// TOULIATOS, Alexander
//
//

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
        List<Object[]> result = (List) criteria.list();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Afficher le nombre de consultations par spécialité               ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (Object[] object : result) {
            System.out.println("Nombre de consultations : " + object[0]);
            System.out.println("Titre de spécialité     : " + (object[1] != null ? object[1] : "[aucune specialité]"));
            System.out.println(" //////////////////////////////////////");
        }

        session.close();

    }

}
