/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import projetfinsessiona10gr233.HibernateUtil;

/**
 *
 * @author 1895040
 */
public class ConsultationDAO
{
    static Session session=null;
   
    public static void nbConsultationsParAnnee()
    {
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select count(*), EXTRACT(YEAR FROM ordonnance.datec) "+
                                           "from Consultation "+
                                           "group by EXTRACT(YEAR FROM ordonnance.datec)");
       
        List<Object[]> results = query.list();
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Afficher le nombre de consultations par année                    ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (Object[] ligneOrd : results)
        {
            System.out.println(" L'année des consultations : " + ligneOrd[1]);
            System.out.println(" Le nombre de consultation : " + ligneOrd[0]);
            
            
            System.out.println(" //////////////////////////////////////");
        }
        session.close();
    }    


    
}
