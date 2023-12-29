package Metier;

import dao.BudgetDao;
import entites.Budget;
import entites.Compte;
import entites.Projet;

import java.util.List;

public class BudgetMetier {


    private BudgetDao dao = new BudgetDao();


    public Budget creationBudget(Projet projet,Budget budgetsaisi)throws Exception{

        if(budgetsaisi.getBudallpro() == null || budgetsaisi.getBudep() == null || budgetsaisi.getDevise().trim().equals(""))
            throw new Exception("the fields must not be empty");
        budgetsaisi.setProjet(projet);
        Budget data = dao.addBudget(budgetsaisi);


        return data;
    }

    public  Budget updateBudget(Projet projet,Budget budgetsaisi)throws  Exception{
        if(budgetsaisi.getBudallpro() == null || budgetsaisi.getBudep() == null || budgetsaisi.getDevise().trim().equals(""))
            throw new Exception("the fields must not be empty");
        budgetsaisi.setIdebudget(projet.getIdepro());
        budgetsaisi.setProjet(projet);
        Budget data = dao.updateBudget(budgetsaisi);

        return data;
    }

    public void deleteBudget(Projet projet)throws Exception{

        dao.deleteBudget(projet.getBudget());
    }

    public List<Budget> gettallbudgetbyprojet(Projet projet)throws Exception{

        List<Budget> data = dao.findAllByprojet(projet);
        return data;
    }

    public Double pourcentageDep(Budget budget)throws Exception{

        Double pourcentage = (Double) (budget.getBudep()*100)/(budget.getBudallpro());
        return pourcentage;
    }




}
