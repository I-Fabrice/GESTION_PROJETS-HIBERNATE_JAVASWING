package dao;

import entites.Equipe;
import entites.Projet;
import lombok.var;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateCRUD;

import java.util.List;

public class EquipeDao implements IEquipeDao{

    HibernateCRUD<Equipe> crud = new HibernateCRUD<>();

    SessionFactory factory = ConnectionUtil.getFactory();

    private static final SessionFactory FACTORY = ConnectionUtil.getFactory();
    private Session session;

    @Override
    public Equipe addEquipe(Equipe equipe) throws Exception {
        return crud.add(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) throws Exception {
        return crud.update(equipe);
    }

    @Override
    public Equipe deleteEquipe(Equipe equipe) throws Exception {
        return crud.delete(equipe);
    }

    @Override
    public Equipe findByID(Long ideequ) throws Exception {
        return crud.findByID(ideequ,Equipe.class);
    }

    @Override
    public List<Equipe> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Equipe> findAllTacheByProjet(Long id) throws Exception {
        return crud.findAllEquipeByProjet(id);
    }

    @Override
    public Equipe findAllTacheByname(String name) throws Exception {
        Equipe equipe = null ;
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            var results = session.createQuery("From Equipe e where e.nomequ = '"+name+"'").list();
            if(results.size()>0)
                equipe = (Equipe) results.get(0);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            throw e ;
        }finally {
            session.close();
        }
        return equipe;
    }

    @Override
    public Equipe findEquipeByprojet(Projet projet) throws Exception {
        Equipe equipe = null ;
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            var results = session.createQuery("From Equipe e where e.projet= '"+projet+"'").list();
            if(results.size()>0)
                equipe = (Equipe) results.get(0);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            throw e ;
        }finally {
            session.close();
        }
        return equipe;
    }


}
