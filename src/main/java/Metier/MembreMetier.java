package Metier;

import dao.MembreDao;
import entites.*;

import java.util.List;


public class MembreMetier {

    private MembreDao dao = new MembreDao();
    EquipeMetier metierEquipe = new EquipeMetier();

    public Membre creationMembre(Membre membre)throws Exception{

        if(membre.getNom().trim().equals("") || membre.getMail().trim().equals("") )
            throw new Exception("the fields must not be empty");

        Membre membrecreer = dao.addMembre(membre);


        return membrecreer;

    }

    public Membre updateMembre(Compte compte, Membre membresaisi)throws Exception{

        if(membresaisi.getNom().trim().equals("")  || membresaisi.getMail().trim().equals("") )
            throw new Exception("the fields must not be empty");
         membresaisi.setIdmem(compte.getMembre().getIdmem());
         membresaisi.setEquipe(compte.getMembre().getEquipe());
         Membre membre = dao.updateMembre(membresaisi);

         return membre;
    }

    public Membre updatMembre(Membre membresaisi)throws Exception{

        if(membresaisi.getNom().trim().equals("")  || membresaisi.getMail().trim().equals("") )
            throw new Exception("the fields must not be empty");
        Membre membre = dao.updateMembre(membresaisi);

        return membre;
    }


    public Membre AffecterMemEquipe(Compte compte,Equipe equipe)throws Exception{

        if(equipe.getIdeequ() == null)
            throw new Exception("the fields must not be empty");

        compte.getMembre().setEquipe(equipe);

        Membre data = dao.updateMembre(compte.getMembre());

        return data;
    }

    /*public List<Membre> getAllByEquipe(Compte compte)throws Exception{

        List<Membre> data =  dao.findAllByEquipe(compte.getMembre().getEquipe().getIdeequ());

        return data;
    }*/



    public List<Membre> findmembrebyname(Equipe equipe)throws Exception{

        return dao.findAllByEquipe(equipe.getIdeequ());
    }

    public Membre findbyname(String name)throws Exception{

        Membre m = dao.findByname(name);
        if(m == null)
            throw new Exception("Select Member before");

        return m;
    }

    public void deletemembre(Membre membre)throws Exception{

        dao.deleteMembre(membre);
    }

}
