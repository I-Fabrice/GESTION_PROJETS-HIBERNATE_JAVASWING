package Metier;

import dao.CompteDao;
import entites.Compte;
import entites.Membre;
import entites.Role;
import util.HibernateCRUD;

import java.util.List;

public class CompteMetier {


    private CompteDao dao = new CompteDao();


    public Compte Connexion(String idcompte, String password) throws Exception{

        if(idcompte.trim().equals("") || password.trim().equals(""))
        {
            throw new Exception(" login and password mustn't null...");
        }
        Compte compte = dao.findByID(idcompte);
        if(compte.getMotpas().trim().equals(password))
            System.out.println();
        else
             throw new Exception("Incorrect Password");

        return compte;
    }

    public Compte creationCompte(Membre membrecreer, Role rolecreer, Compte compte) throws Exception{

        if(compte.getIdcompte() == null || compte.getMotpas().trim().equals(""))
        {
            throw new Exception("id or password mustn't be null");
        }
                compte.setMembre(membrecreer);
                compte.setRole(rolecreer);
                Compte comptecreer = dao.addCompte(compte);

        return comptecreer;
    }


    public void RéinitialiserCompte(String idcompte) throws Exception{
        if (idcompte == null) throw new Exception("idcompte mustn't be null");
        Compte compte = dao.findByID(idcompte);
        dao.deleteCompte(compte);
    }

    public Compte updateCompte(Compte compte,Compte comptesaisi)throws Exception{

        if(comptesaisi.getMotpas().trim().equals(""))
            throw new Exception("the fields must not be empty");
        comptesaisi.setIdcompte(compte.getIdcompte());
        comptesaisi.setRole(compte.getRole());
        comptesaisi.setMembre(compte.getMembre());
        Compte data = dao.updateCompte(comptesaisi);

        return data;
    }

    public void deleteCompte(Compte compte) throws Exception{
        dao.deleteCompte(compte);
    }

    public Compte getcomptebyid(Compte compte)throws Exception{

        return dao.findByID(compte.getIdcompte());
    }

    public Compte comptebyname(String name)throws Exception{
        return dao.findByID(name);
    }



}
