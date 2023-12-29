import entites.Equipe;
import entites.Projet;
import entites.Tache;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateCRUD;

import java.util.Date;
import java.util.List;

public class TacheTest {

    @Test
    public void addTache(){
        HibernateCRUD<Tache> crud = new HibernateCRUD<>();
        HibernateCRUD<Projet> crud_cat = new HibernateCRUD<>();
        HibernateCRUD<Equipe> crud_cat_ = new HibernateCRUD<>();
        try{
            crud.add(new Tache(null,"M11","Tache marketing","vendre produit M92", null,"dd",crud_cat.findByID(1,Projet.class),crud_cat_.findByID(1,Equipe.class)));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void updateTache(){
        HibernateCRUD<Tache> crud = new HibernateCRUD<>();
        HibernateCRUD<Projet> crud_cat = new HibernateCRUD<>();
        HibernateCRUD<Equipe> crud_cat_ = new HibernateCRUD<>();
        try{
            crud.update(new Tache(null,"P01","commercial","vendre produit M92", null,"dd",crud_cat.findByID(1,Projet.class),crud_cat_.findByID(1,Equipe.class)));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void deleteTache(){
        HibernateCRUD<Tache> crud = new HibernateCRUD<>();
        try{
            crud.delete(crud.findByID(1,Tache.class));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getTache(){
        HibernateCRUD<Tache> crud = new HibernateCRUD<>();
        try{
            Tache tache = crud.findByID(2,Tache.class);
            Assert.assertEquals(tache.getIdtache(),null);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getAllTache(){
        HibernateCRUD<Tache> crud = new HibernateCRUD<>();
        try{
            List<Tache> taches = crud.findAll("Tache");
            Assert.assertEquals(taches.size(),1);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }



}
