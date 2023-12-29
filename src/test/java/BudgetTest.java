import entites.Budget;
import entites.Projet;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateCRUD;

import java.util.List;

public class BudgetTest {
    @Test
    public void addBudget(){
        HibernateCRUD<Budget> crud = new HibernateCRUD<>();
        HibernateCRUD<Projet> crud_cat = new HibernateCRUD<>();
        try {
            crud.add(new Budget(null,321000.0,5000.0,"100", crud_cat.findByID(2,Projet.class)));
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void updateBudget(){
        HibernateCRUD<Budget> crud = new HibernateCRUD<Budget>();
        HibernateCRUD<Projet> crud_cat = new HibernateCRUD<>();
        try {
            crud.update(new Budget(null,15000.0,5000.0,"100", crud_cat.findByID(1,Projet.class)));
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void deleteBudget(){
        HibernateCRUD<Budget> crud = new HibernateCRUD<Budget>();
        try {
            crud.delete(crud.findByID(1,Budget.class));
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getBudget(){
        HibernateCRUD<Budget> crud = new HibernateCRUD<Budget>();
        try {
            Budget budget = crud.findByID(null,Budget.class);
            Assert.assertEquals(budget.getIdebudget(),null);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


    @Test
    public void getAllBudget(){
        HibernateCRUD<Budget> crud = new HibernateCRUD<Budget>();
        try {
            List<Budget> budget = crud.findAll("Budget");
            Assert.assertEquals(budget.size(), 1);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
