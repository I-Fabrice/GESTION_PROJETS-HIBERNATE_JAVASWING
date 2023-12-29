import entites.*;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateCRUD;

import java.util.List;

public class CompteTest {


    @Test
    public void addCompte(){
        HibernateCRUD<Compte> crud = new HibernateCRUD<>();
        HibernateCRUD<Role> crud_cat = new HibernateCRUD<>();
        HibernateCRUD<Membre> crud_cat_ = new HibernateCRUD<>();
        try {
            crud.add(new Compte("4568L","thug",crud_cat.findByID(1,Role.class),crud_cat_.findByID(1,Membre.class)));
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


    @Test
    public void updateCompte(){
        HibernateCRUD<Compte> crud = new HibernateCRUD<>();
        HibernateCRUD<Role> crud_cat = new HibernateCRUD<>();
        HibernateCRUD<Membre> crud_cat_ = new HibernateCRUD<>();
        try{
            crud.update(new Compte("4569L","picglass",crud_cat.findByID(1,Compte.class),crud_cat_.findByID(1,Membre.class)));
            Assert.assertTrue(true);
        } catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void deleteCompte(){
        HibernateCRUD<Compte> crud = new HibernateCRUD<>();
        try {
            crud.delete(crud.findByID(1234,Compte.class));
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
    @Test
    public void getCompte(){
        HibernateCRUD<Compte> crud = new HibernateCRUD<>();
        try {
            Compte compte = crud.findByID(1,Compte.class);
            Assert.assertEquals(compte.getIdcompte(),null);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getAllCompte(){
        HibernateCRUD<Compte> crud = new HibernateCRUD<>();
        try{
            List<Compte> comptes = crud.findAll("Compte");
            Assert.assertEquals(comptes.size(),2);

        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

}
