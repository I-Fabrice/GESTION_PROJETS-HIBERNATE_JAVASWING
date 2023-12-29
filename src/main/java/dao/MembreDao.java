package dao;

import entites.Equipe;
import entites.Membre;
import entites.Projet;
import lombok.var;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateCRUD;

import java.util.ArrayList;
import java.util.List;

public class MembreDao implements IMembreDao {

    HibernateCRUD<Membre> crud = new HibernateCRUD<>();

    private static final SessionFactory FACTORY = ConnectionUtil.getFactory();
    private Session session;

    SessionFactory factory = ConnectionUtil.getFactory();

    @Override
    public Membre addMembre(Membre membre) throws Exception {

        return crud.add(membre);
    }

    @Override
    public Membre updateMembre(Membre membre) throws Exception {
        return crud.update(membre);
    }

    @Override
    public Membre deleteMembre(Membre membre) throws Exception {
        return crud.delete(membre);
    }

    @Override
    public Membre findByID(Long idmem) throws Exception {
        return crud.findByID(idmem,Membre.class);
    }

    @Override
    public List<Membre> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Membre> findAllByEquipe(Long id) throws Exception {
        return crud.findAllMembreByEquipe(id);
    }

    @Override
    public List<Membre> findMembreByname(Equipe equipe) throws Exception {
        List<Membre> list = new ArrayList<>();
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            String x = equipe.getIdeequ()+"";
            list = session.createQuery("from Membre m where m.equipe = "+x).list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return list;
    }

    @Override
    public Membre findByname(String name) throws Exception {
        Membre membre = null ;
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            var results = session.createQuery("From Membre m where m.nom = '"+name+"'").list();
            if(results.size()>0)
                membre = (Membre) results.get(0);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            throw e ;
        }finally {
            session.close();
        }
        return membre;
    }


}
