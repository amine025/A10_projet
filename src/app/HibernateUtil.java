package app;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
//
//
// CIAMPA, Gian Gabriele
// GHODBANE, Mohammed El Amine
// TARHOUNI, Mohamed Amine
// TOULIATOS, Alexander
//
//

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
