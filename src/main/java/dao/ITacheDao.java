package dao;

import entites.Equipe;
import entites.Projet;
import entites.Role;
import entites.Tache;

import java.util.List;

public interface ITacheDao {

    public Tache addTache(Tache tache) throws Exception;
    public Tache updateTache(Tache tache)throws Exception;
    public Tache deleteTache(Tache tache)throws Exception;
    public Tache findByID(Long idtache)throws Exception;
    public List<Tache> findAll()throws Exception;
    public List<Tache> findAllTacheByProjet(Long id) throws Exception;
    public Tache findTacheByname(String name) throws Exception;

    public List<Tache> findTacheByequipe(Equipe equipe) throws Exception;

}
