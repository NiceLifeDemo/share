package com.techrc.service;

import com.techrc.mapper.UserMapper;
import com.techrc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

     public User findCurrentUser(){

         User user=userMapper.findUserBySome();
         return  user;


     };


    public User findUserByBNameAndPassword(String realName,String password){

        User user=userMapper.findUserByBNameAndPassword(realName,password);
        return  user;
    };


}
