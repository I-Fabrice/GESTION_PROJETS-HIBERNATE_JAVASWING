package dao;

import entites.Compte;

import java.io.Serializable;
import java.util.List;

public interface ICompteDao {


    public Compte addCompte(Compte compte) throws Exception;
    public Compte updateCompte(Compte compte)throws Exception;
    public Compte deleteCompte(Compte compte)throws Exception;
    public Compte findByID(String idcompte)throws Exception;
    public List<Compte> findAll()throws Exception;


}
