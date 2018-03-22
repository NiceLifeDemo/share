 package com.techrc.controller;

 import com.techrc.dto.UserInfoDTO;
 import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


 @RestController
 public class LoginController
 {
   @GetMapping({"/index"})
   @ApiOperation(value="欢迎语", tags={"首页"})
   public String index()
   {
    return "hello springBoot!";
   }

   @PostMapping({"/dologin"})
   @ApiOperation(value="登陆", tags={"首页"})
   public String doLogin(@Valid @RequestBody UserInfoDTO userInfoDTO)
   {
     String userName = userInfoDTO.getUserName();

     String password = userInfoDTO.getPassword();

     if (("ty".equals(userName)) && ("888888".equals(password))) {
      return "suc";
     }
    return "fail";
  }
}

