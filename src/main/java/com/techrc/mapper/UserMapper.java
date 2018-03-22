package com.techrc.mapper;

import com.techrc.model.User;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface UserMapper
{
   List<Map<String, Object>> findUserInfo();
  
    void addUser(User paramUser);
}


