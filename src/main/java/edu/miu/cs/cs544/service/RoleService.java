package edu.miu.cs.cs544.service;

import edu.miu.cs.cs544.model.Role;

public interface RoleService {
    public Role addOneRole(Role role);
    public Role updateOneRoleByRoleId(Integer id, String name);
    public String deleteOneRoleByRoleId(Integer id);
}