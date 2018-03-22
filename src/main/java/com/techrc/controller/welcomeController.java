 package com.techrc.controller;

import io.swagger.annotations.ApiOperation;
 import java.util.HashMap;
 import java.util.Map;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;


@RestController
 public class WelcomeController
 {
   @GetMapping({"/getUserInfo"})
   @ApiOperation(value="我的信息", tags={"用户信息"})
   public Map<String, String> getUserInfo(HttpServletRequest request)
   {
     Map<String, String> map = new HashMap();
     map.put("name", "唐煜");
     map.put("sex", "男");
     map.put("age", "25");
     return map;
  }
 }


