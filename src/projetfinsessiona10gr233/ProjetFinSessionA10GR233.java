/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinsessiona10gr233;

import DAO.ConsultationDAO;

/**
 *
 * @author Gian Gabriele Ciampa,
 *         Amine Tarhouni
 *         Amine Godhbane
 *         Alexander Touliatos
 */
public class ProjetFinSessionA10GR233 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Afficher le nombre de consultations par années
//        ConsultationDAO.nbConsultationsParAnnee();
        
        // Afficher le nombre de consultations par spécialité
        ConsultationDAO.nbConsultationsParSpecialite();
        
        HibernateUtil.getSessionFactory().close();
    }
    
}
