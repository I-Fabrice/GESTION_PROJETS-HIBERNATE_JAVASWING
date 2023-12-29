package dao;

import entites.Compte;
import entites.Membre;
import entites.Projet;

import java.util.List;

public interface IProjetDao {

    public Projet addProjet(Projet projet) throws Exception;
    public Projet updateProjet(Projet projet)throws Exception;
    public Projet deleteProjet(Projet projet)throws Exception;
    public Projet findByID(Long idepro)throws Exception;
    public List<Projet> findAllProjetByCompte(Long id) throws Exception;
    public Projet findAllProjetByname(String name) throws Exception;
    List<Projet> findAll()throws Exception;
}
