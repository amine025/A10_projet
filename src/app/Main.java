package app;

import DAO.ConsultationDAO;
import DAO.MedicamentDAO;
//
//
// CIAMPA, Gian Gabriele
// GHODBANE, Mohammed El Amine
// TARHOUNI, Mohamed Amine
// TOULIATOS, Alexander
//
//
public class Main {

    public static void main(String[] args) {

        // Afficher le nombre de consultations par années
        ConsultationDAO.nbConsultationsParAnnee();

        // Afficher le nombre de consultations par spécialité
        ConsultationDAO.nbConsultationsParSpecialite();

        // Afficher le nombre de médicaments prescripts par docteur
        MedicamentDAO.nbMedicamentsParDocteur();

        HibernateUtil.getSessionFactory().close();
    }

}
