package dao;

import com.sun.deploy.security.SelectableSecurityManager;
import entites.Budget;
import entites.Compte;
import util.HibernateCRUD;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompteDao implements ICompteDao {

    HibernateCRUD<Compte> crud = new HibernateCRUD<>();
    @Override
    public Compte addCompte(Compte compte) throws Exception {

        if(crud.findByID(compte.getIdcompte(),Compte.class) != null)
            throw new Exception("already account with this id");
        return crud.add(compte);
    }

    @Override
    public Compte updateCompte(Compte compte) throws Exception {
        if(crud.findByID(compte.getIdcompte(),Compte.class) == null)
            throw new Exception("None account with this id");

        return crud.update(compte);
    }

    @Override
    public Compte deleteCompte(Compte compte) throws Exception {
        return crud.delete(compte);
    }


    public Compte findByID(String idcompte) throws Exception {
        if(crud.findByID(idcompte,Compte.class) == null)
            throw new Exception("there is no account with this login...");

        return crud.findByID(idcompte,Compte.class);
    }

    @Override
    public List<Compte> findAll() throws Exception {
        return crud.findAll("compte");
    }
}
