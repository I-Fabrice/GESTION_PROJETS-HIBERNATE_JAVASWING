import entites.*;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateCRUD;

import java.util.List;

public class EquipeTest {

    @Test
    public void addEquipe(){

        HibernateCRUD<Equipe> crud = new HibernateCRUD<>();
       // HibernateCRUD<Projet> crud_cat = new HibernateCRUD<>();

        try{
            crud.add(new Equipe(null,"groupe1","objectif", null, null,null));
            Assert.assertTrue(true);
        } catch(Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void updateEquipe(){
        HibernateCRUD<Equipe> crud = new HibernateCRUD<>();
       // HibernateCRUD<Projet> crud_cat = new HibernateCRUD<>();

        try {
            crud.update(new Equipe(null,"Groupe2","but2", null, null,null));
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void deleteEquipe(){
        HibernateCRUD<Equipe> crud = new HibernateCRUD<>();
        try {
            crud.delete(crud.findByID(1,Equipe.class));
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getEquipe(){
        HibernateCRUD<Equipe> crud = new HibernateCRUD<>();
        try{
            Equipe equipe = crud.findByID(2,Equipe.class);
            Assert.assertEquals(equipe.getIdeequ(),null);
        } catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getAllEquipe(){
        HibernateCRUD<Equipe> crud = new HibernateCRUD<>();
        try{
            List<Equipe> equipe = crud.findAll("Equipe");
            Assert.assertEquals(equipe.size(),2);
        } catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }

    }
}
