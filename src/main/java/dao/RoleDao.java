package dao;

import entites.Role;
import util.HibernateCRUD;

import java.util.List;

public class RoleDao implements IRoleDao{

    HibernateCRUD<Role> crud = new HibernateCRUD<>();

    @Override
    public Role addRole(Role role) throws Exception {
        return crud.add(role);
    }

    @Override
    public Role updateRole(Role role) throws Exception {
        return crud.update(role);
    }

    @Override
    public Role deleteRole(Role role) throws Exception {
        return crud.delete(role);
    }

    @Override
    public Role findByID(Long idemat) throws Exception {
        return crud.findByID(idemat,Role.class);
    }

    @Override
    public List<Role> findAll() throws Exception {
        return crud.findAll("role");
    }
}
