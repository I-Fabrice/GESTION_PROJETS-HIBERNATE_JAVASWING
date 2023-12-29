package dao;

import entites.Compte;
import entites.Membre;
import entites.Projet;
import lombok.var;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateCRUD;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjetDao implements IProjetDao {

    HibernateCRUD<Projet> crud = new HibernateCRUD<>();

    SessionFactory factory = ConnectionUtil.getFactory();

    @Override
    public Projet addProjet(Projet projet) throws Exception {
        return crud.add(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) throws Exception {
        return crud.update(projet);
    }

    @Override
    public Projet deleteProjet(Projet projet) throws Exception {
        return crud.delete(projet);
    }

    @Override
    public Projet findByID(Long idepro) throws Exception {
        return crud.findByID(idepro,Projet.class);
    }

    @Override
    public List<Projet> findAllProjetByCompte(Long id) throws Exception {

        return crud.findAllProjetByCompte(id);
    }

    @Override
    public Projet findAllProjetByname(String name) throws Exception {
        Projet projet = null ;
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            var results = session.createQuery("From Projet p where p.nompro = '"+name+"'").list();
            if(results.size()>0)
                projet = (Projet) results.get(0);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            throw e ;
        }finally {
            session.close();
        }
        return projet;
    }

    @Override
    public List<Projet> findAll() throws Exception {

        return crud.findAll("Projet");

    }
}
