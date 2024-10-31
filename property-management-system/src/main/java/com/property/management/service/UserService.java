package com.property.management.service;

import com.property.management.entity.User;
import com.property.management.util.LayUtil;

public interface UserService {
    User login(String username, String password);

    Boolean register(User user);

    Boolean userUpdate(User user);
}
