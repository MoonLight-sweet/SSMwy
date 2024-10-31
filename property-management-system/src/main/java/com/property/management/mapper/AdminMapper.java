package com.property.management.mapper;

import com.property.management.entity.Admin;
import com.property.management.entity.Role;
import com.property.management.entity.User;

import java.util.List;

public interface AdminMapper {
    List<Admin> queryByName(String username);

    Long queryByNameCount(String username);

    int deleteAdminlById(Integer id);

    int deleteAdminByIds(String ids);

    List<Role> queryRoleInfo();

    int adminInsert(User user);

    Admin queryAdminById(Integer id);

    int updateAdmin(User user);

    User usernameCheck(String name);
}
