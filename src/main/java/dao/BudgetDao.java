package dao;

import entites.Budget;
import entites.Projet;
import lombok.var;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateCRUD;

import java.util.ArrayList;
import java.util.List;

public class BudgetDao implements IBudgetDao{
    HibernateCRUD<Budget> crud = new HibernateCRUD<>();

    private static final SessionFactory FACTORY = ConnectionUtil.getFactory();
    private Session session;

    @Override
    public Budget addBudget(Budget budget1) throws Exception {
        List<Budget> data = findAllByprojet(budget1.getProjet());
        if(data.size() == 1)
            throw new Exception("already Budget for this project");
        else
         return crud.add(budget1);

    }

    @Override
    public Budget deleteBudget(Budget budget) throws Exception {
        return crud.delete(budget);
    }

    @Override
    public Budget updateBudget(Budget budget) throws Exception {
        return crud.update(budget);
    }

    @Override
    public List<Budget> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Budget> findAllByprojet(Projet projet) throws Exception {
        List<Budget> list = new ArrayList<>();
        try {
            session = FACTORY.openSession();
            session.beginTransaction();
            String x= projet.getIdepro()+"";
            list = session.createQuery("from Budget b where b.projet = "+x).list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return list;
    }

    @Override
    public Budget findByID(Long idebudget) throws Exception {
        return crud.findByID(idebudget,Budget.class);
    }
}
