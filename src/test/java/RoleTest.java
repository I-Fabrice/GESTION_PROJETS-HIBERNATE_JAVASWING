import entites.Compte;
import entites.Role;
import org.junit.Assert;
import org.junit.Test;
import util.HibernateCRUD;

import java.util.List;


public class RoleTest {
    @Test
    public void addRole(){

        HibernateCRUD<Role> crud = new HibernateCRUD<>();

        try{

            crud.add(new Role(null,"false",null));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void UpdateRole(){
        HibernateCRUD<Role> crud = new HibernateCRUD<>();
        try{

            crud.update(new Role(null,"true",null));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void deleteRole(){
        HibernateCRUD<Role> crud = new HibernateCRUD<Role>();
        try{

            crud.delete(crud.findByID(1,Role.class));
            Assert.assertTrue(true);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getRole(){
        HibernateCRUD<Role> crud = new HibernateCRUD<>();
        try{

            Role role = crud.findByID(2,Role.class);
            Assert.assertEquals(role.getIdemat(),null);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void getAllRole(){
        HibernateCRUD<Role> crud = new HibernateCRUD<>();
        try{

            List<Role> roles = crud.findAll("Role");
            Assert.assertEquals(roles.size(),1);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }





}
