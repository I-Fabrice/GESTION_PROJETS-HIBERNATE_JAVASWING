package dao;

import entites.Projet;
import entites.Role;

import java.util.List;

public interface IRoleDao {

    public Role addRole(Role role) throws Exception;
    public Role updateRole(Role role)throws Exception;
    public Role deleteRole(Role role)throws Exception;
    public Role findByID(Long idemat)throws Exception;
    List<Role> findAll()throws Exception;

}
