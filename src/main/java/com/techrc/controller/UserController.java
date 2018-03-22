 package com.techrc.controller;

import com.techrc.mapper.UserMapper;
 import com.techrc.model.User;
 import io.swagger.annotations.ApiOperation;
 import java.util.List;
 import java.util.Map;
 import javax.validation.Valid;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

        @RestController
        @RequestMapping({"/user"})
 public class UserController
{
   @Autowired
   private UserMapper userMapper;

   @GetMapping({"/getUserInfo"})
   @ApiOperation(value="查询用户", tags={"用户"})
  public List<Map<String, Object>> getUserInfo()
  {
    List<Map<String, Object>> user = this.userMapper.findUserInfo();
     return user;
   }

   @PostMapping({"/addUser"})
  @ApiOperation(value="新增用户", tags={"用户"})
   public String addUser(@Valid @RequestBody User user)
   {
     try {
      this.userMapper.addUser(user);
     } catch (Exception e) {
       e.printStackTrace();
       return "fail";
     }

    return "success";
  }
 }
