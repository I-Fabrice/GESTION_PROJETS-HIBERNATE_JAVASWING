package dao;

import entites.Budget;
import entites.Projet;

import java.util.List;

public interface IBudgetDao {
    public Budget addBudget(Budget Budget) throws Exception;
    public Budget deleteBudget(Budget Budget) throws Exception;
    public Budget updateBudget(Budget Budget) throws Exception;
    public List<Budget> findAll() throws Exception;
    public List<Budget> findAllByprojet(Projet projet) throws Exception;
    public Budget findByID(Long idebudget) throws Exception;
}
