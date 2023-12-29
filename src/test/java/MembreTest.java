import entites.*;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateCRUD;

import java.util.Date;
import java.util.List;

public class MembreTest {

    @Test
    public void addMembre(){
        HibernateCRUD<Membre> crud = new HibernateCRUD<>();
        HibernateCRUD<Equipe> crud_cat = new HibernateCRUD<>();
        HibernateCRUD<Compte> crud1 = new HibernateCRUD<>();

        try{

            crud.add(new Membre(null,"Elenga","issangafabrice04@gmail.com","true",crud_cat.findByID(1,Equipe.class),crud1.findByID(1,Compte.class),null));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void updateMembre(){
        HibernateCRUD<Membre> crud = new HibernateCRUD<>();
        HibernateCRUD<Equipe> crud_cat = new HibernateCRUD<>();
        HibernateCRUD<Compte> crud1 = new HibernateCRUD<>();
        HibernateCRUD<Projet> crud_cat_ = new HibernateCRUD<>();
        try{
            crud.update(new Membre(null,"Elenga","Marcia04@gmail.com","true",crud_cat.findByID(1,Equipe.class),crud1.findByID(1,Compte.class),null));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void deleteMembre(){
        HibernateCRUD<Membre> crud = new HibernateCRUD<>();
        try {
            crud.delete(crud.findByID(1,Membre.class));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getMembre(){
        HibernateCRUD<Membre> crud = new HibernateCRUD<>();
        try {
            Membre membre = crud.findByID(2,Membre.class);
            Assert.assertEquals(membre.getIdmem(),null);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


    @Test
    public void getAllMembre(){
        HibernateCRUD<Membre> crud = new HibernateCRUD<>();
        try {
            List<Membre> membres = crud.findAll("Membre");
            Assert.assertEquals(membres.size(), 2);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
