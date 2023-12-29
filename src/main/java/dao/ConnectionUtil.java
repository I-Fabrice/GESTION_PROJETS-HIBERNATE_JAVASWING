package dao;


import entites.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {

    private static SessionFactory factory = null;
    static{

        factory = new Configuration().configure()
                .addAnnotatedClass(Budget.class)
                .addAnnotatedClass(Projet.class)
                .addAnnotatedClass(Equipe.class)
                .addAnnotatedClass(Membre.class)
                .addAnnotatedClass(Tache.class)
                .addAnnotatedClass(Compte.class)
                .addAnnotatedClass(Role.class).buildSessionFactory();
    }
    public static SessionFactory getFactory(){
        return factory;
    }
}
