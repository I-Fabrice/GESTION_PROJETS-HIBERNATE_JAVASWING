package Metier;

import dao.ProjetDao;
import entites.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ProjetMetier {

    private ProjetDao dao = new ProjetDao();

    public Projet creationProjet(Projet projet1, Compte compte)throws Exception{

        if(projet1.getNompro().trim().equals("") || projet1.getTypro().trim().equals("") ||projet1.getDespro().trim().equals(""))
            throw new Exception("the fields must not be empty");
        projet1.setMembre(compte.getMembre());
        Projet projet = dao.addProjet( projet1);

        return  projet;
    }

    public  List<Projet> getAllBycompte(Compte compte)throws Exception{

        return dao.findAllProjetByCompte(compte.getMembre().getIdmem());
    }

    public  Projet getAllByname(String name)throws Exception{

        return dao.findAllProjetByname(name);
    }




    public Projet updateProjet(Compte compte,Projet projetselect,Projet projetsaisi)throws Exception{

        if(projetsaisi.getNompro().trim().equals("") || projetsaisi.getTypro().trim().equals("") || projetsaisi.getDespro().trim().equals(""))
            throw new Exception("the fields must not be empty");
        projetsaisi.setIdepro(projetselect.getIdepro());
        projetsaisi.setMembre(compte.getMembre());
        projetsaisi.setBudget(projetselect.getBudget());
        Projet data = dao.updateProjet(projetsaisi);

        return data;
    }


   public Projet liaisonBudget(Projet projet, Budget budget) throws Exception{

        projet.setBudget(budget);
        Projet data = dao.updateProjet(projet);

        return data;
   }


   //test
    public Projet projectselect(Long id)throws Exception{

        Projet data = dao.findByID(id);
        return data;
    }





}
