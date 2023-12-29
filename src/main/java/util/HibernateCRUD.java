package util;

import dao.ConnectionUtil;
import entites.Compte;
import entites.Membre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.management.Query;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HibernateCRUD<T> implements ICRUD<T>{

    private static final SessionFactory FACTORY = ConnectionUtil.getFactory();
    private Session session;

    public T add(T t) throws Exception {
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            session.save(t);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return t ;
    }


    public T update(T t) throws Exception {
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            session.update(t);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return t ;
    }

    public T delete(T t) throws Exception {
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            session.delete(t);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return t ;
    }


    public T findByID(Serializable id, Class _class) throws Exception {
        T t = null ;
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            t = (T) session.get(_class,id);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return t;
    }


    public List<T> findAll(String className) {
        List<T> list = new ArrayList<>();
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            list = session.createQuery("from "+className).list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<T> findAllProjetByCompte(Long id) throws Exception {
        List<T> list = new ArrayList<>();
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            String x= id+"";
            list = session.createQuery("from Projet where membre_idmem = "+x).list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<T> findAllTacheByProjet(Long id) throws Exception {
        List<T> list = new ArrayList<>();
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            String x= id+"";
            list = session.createQuery("from Tache where projet_idepro = "+x).list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<T> findAllEquipeByProjet(Long id) throws Exception {
        List<T> list = new ArrayList<>();
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            String x= id+"";
            list = session.createQuery("from Equipe where projet_idepro = "+x).list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<T> findAllMembreByEquipe(Long id) throws Exception {
        List<T> list = new ArrayList<>();
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            String x= id+"";
            list = session.createQuery("from Membre where equipe_ideequ = "+x).list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return list;
    }


}
