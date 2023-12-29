package util;

import entites.Compte;
import entites.Membre;

import java.io.Serializable;
import java.util.List;

public interface ICRUD<T> {
    public T add(T t) throws Exception;
    public T update(T t) throws Exception;
    public T delete(T t) throws Exception;
    public T findByID(Serializable id, Class _class) throws Exception;
    public List<T> findAll(String className);

    public List<T> findAllProjetByCompte(Long id)throws Exception;
    public List<T> findAllTacheByProjet(Long id)throws Exception;

    public List<T> findAllEquipeByProjet(Long id)throws Exception;
    public List<T> findAllMembreByEquipe(Long id)throws Exception;






}
