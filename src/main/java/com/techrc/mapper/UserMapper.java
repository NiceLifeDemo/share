package com.techrc.mapper;

import com.techrc.model.User;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public abstract interface UserMapper
{
   List<Map<String, Object>> findUserInfo();

    User findUserBySome();
    void addUser(User paramUser);

    User findUserByBNameAndPassword(@Param("realName") String realName, @Param("password")String password);
}


