package Metier;


import dao.EquipeDao;

import entites.Equipe;
import entites.Projet;


import java.util.List;

public class EquipeMetier {

    private EquipeDao dao = new EquipeDao();

    public Equipe creationEquipe(Equipe equipesaisi,Projet projetselect)throws Exception{

       if(equipesaisi.getNomequ().trim().equals("") || equipesaisi.getObjequ().trim().equals(""))
           throw new Exception("the fields must not be empty");
       equipesaisi.setProjet(projetselect);
       Equipe data = dao.addEquipe(equipesaisi);

       return data;


    }

    public  List<Equipe> getAllByProjet(Projet projet)throws Exception{

        return  dao.findAllTacheByProjet(projet.getIdepro());
    }


    //Pour le projetSelect
    public Equipe findEquipe(Long id)throws Exception{

        return dao.findByID(id);
    }

    public Equipe updateEquipe(Equipe equipeselect,Equipe equipesaisi)throws Exception{

        if(equipesaisi.getNomequ().trim().equals("") || equipesaisi.getObjequ().trim().equals(""))
            throw new Exception("the fields must not be empty");
        equipesaisi.setIdeequ(equipeselect.getIdeequ());
        equipesaisi.setProjet(equipeselect.getProjet());

        Equipe data = dao.updateEquipe(equipesaisi);

        return data;
    }


    public Equipe findequipebyname(String name)throws Exception{

        Equipe equipe = dao.findAllTacheByname(name);
        if(equipe == null)
            throw new Exception("Not Equipe find");
        return equipe;
    }

    public Equipe findEquipeByprojet(Projet projet)throws Exception{

        return dao.findEquipeByprojet(projet);
    }

    public void DeleteTeam(Equipe equipe)throws Exception{

        dao.deleteEquipe(equipe);
    }

}
