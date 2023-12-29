package dao;

import entites.Equipe;
import entites.Projet;
import entites.Tache;
import lombok.var;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateCRUD;

import java.util.ArrayList;
import java.util.List;

public class TacheDao implements ITacheDao {

    HibernateCRUD<Tache> crud = new HibernateCRUD<>();

    private static final SessionFactory FACTORY = ConnectionUtil.getFactory();
    private Session session;
    SessionFactory factory = ConnectionUtil.getFactory();
    @Override
    public Tache addTache(Tache tache) throws Exception {
        return crud.add(tache);
    }

    @Override
    public Tache updateTache(Tache tache) throws Exception {
        return crud.update(tache);
    }

    @Override
    public Tache deleteTache(Tache tache) throws Exception {
        return crud.delete(tache);
    }

    @Override
    public Tache findByID(Long idtache) throws Exception {
        return crud.findByID(idtache,Tache.class);
    }

    @Override
    public List<Tache> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Tache> findAllTacheByProjet(Long id) throws Exception {
        return crud.findAllTacheByProjet(id);
    }

    @Override
    public Tache findTacheByname(String name) throws Exception {
        Tache tache = null ;
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            var results = session.createQuery("From Tache t where t.nomtac = '"+name+"'").list();
            if(results.size()>0)
                tache = (Tache) results.get(0);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            throw e ;
        }finally {
            session.close();
        }
        return tache;
    }

    @Override
    public List<Tache> findTacheByequipe(Equipe equipe) throws Exception {
        List<Tache> tache = new ArrayList<>();
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            String x= equipe.getIdeequ()+"";
            tache = session.createQuery("from Tache t where t.equipe = "+x).list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return tache;
    }
}
