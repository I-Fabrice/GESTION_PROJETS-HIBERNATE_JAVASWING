package Metier;

import dao.RoleDao;
import entites.Projet;
import entites.Role;

import java.util.List;

public class RoleMetier {


    private RoleDao dao = new RoleDao();


    public Role creationRole(Role role1)throws Exception{

        if(role1.getStatut().isEmpty())
            throw new Exception("the fields must not be empty");

        return dao.addRole(role1);
    }

    public void deleterole(Role role)throws Exception{

        dao.deleteRole(role);
    }


}
