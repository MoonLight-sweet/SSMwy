package com.property.management.service;

import com.property.management.entity.Admin;
import com.property.management.entity.Role;
import com.property.management.entity.User;

import java.util.List;

public interface AdminService {
    List<Admin> queryByName(String username);

    Long queryByNameCount(String username);

    Boolean deleteAdminlById(Integer id);

    Boolean deleteAdminByIds(String ids);

    List<Role> queryRoleInfo();

    Boolean adminInsert(User user);

    Admin queryAdminById(Integer id);

    Boolean updateAdmin(User user);

    Boolean usernameCheck(String name);
}
