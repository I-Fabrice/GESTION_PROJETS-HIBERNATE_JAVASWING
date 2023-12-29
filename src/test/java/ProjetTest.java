import entites.*;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateCRUD;

import java.util.Date;
import java.util.List;

public class ProjetTest {

    @Test
    public void addProjet(){
        HibernateCRUD<Projet> crud = new HibernateCRUD<>();
        HibernateCRUD<Budget> crud_cat = new HibernateCRUD<>();
        HibernateCRUD<Membre> crud_cat1 = new HibernateCRUD<>();

        try{

            crud.add(new Projet(null,"ProjetM11","Projet commercial","Leprojet à pour objectif de préparer le produit N82 ",crud_cat.findByID(1,Budget.class),null,null, null));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }
    @Test
    public void updateProjet(){
        HibernateCRUD<Projet> crud = new HibernateCRUD<>();
        HibernateCRUD<Budget> crud_cat = new HibernateCRUD<>();
        HibernateCRUD<Membre> crud_cat1 = new HibernateCRUD<>();

        try{

            crud.update(new Projet(null,"ProjetL91","Projet commercial","objectif commercial",crud_cat.findByID(1,Budget.class),null,null, null));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void deleteProjet(){
        HibernateCRUD<Projet> crud = new HibernateCRUD<>();
        try{

            crud.delete(crud.findByID(1,Projet.class));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getProjet(){
        HibernateCRUD<Projet> crud = new HibernateCRUD<>();
        try{

            Projet projet = crud.findByID(2,Projet.class);
            Assert.assertEquals(projet.getIdepro(),null);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getAllProjet(){
        HibernateCRUD<Projet> crud = new HibernateCRUD<>();
        try{

            List<Projet> projets = crud.findAll("Projet");
            Assert.assertEquals(projets.size(),2);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

}
