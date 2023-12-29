package dao;

import entites.Equipe;
import entites.Membre;

import java.util.List;

public interface IMembreDao {

    public Membre addMembre(Membre membre) throws Exception;
    public Membre updateMembre(Membre membre)throws Exception;
    public Membre deleteMembre(Membre membre)throws Exception;
    public Membre findByID(Long idmem)throws Exception;
    public List<Membre> findAll()throws Exception;
    public List<Membre> findAllByEquipe(Long id)throws Exception;
    public List<Membre> findMembreByname(Equipe equipe)throws Exception;
    public Membre findByname(String name)throws Exception;

}
