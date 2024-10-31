package com.property.management.mapper;

import com.property.management.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User login(@Param("username") String username,@Param("password") String password);

    Boolean insertUser(User user);

    int userUpdate(User user);
}
