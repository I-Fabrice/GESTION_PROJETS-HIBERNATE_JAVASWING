package dao;

import entites.Compte;
import entites.Equipe;
import entites.Projet;

import java.util.List;

public interface IEquipeDao {
    public Equipe addEquipe(Equipe equipe) throws Exception;
    public Equipe updateEquipe(Equipe equipe)throws Exception;
    public Equipe deleteEquipe(Equipe equipe)throws Exception;
    public Equipe findByID(Long ideequ) throws Exception;
    public List<Equipe> findAll() throws Exception;

    public List<Equipe> findAllTacheByProjet(Long id) throws Exception;
    public Equipe findAllTacheByname(String name) throws Exception;

    public Equipe findEquipeByprojet(Projet projet) throws Exception;


}
