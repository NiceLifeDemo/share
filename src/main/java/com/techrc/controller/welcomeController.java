package com.techrc.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/18.
 */


@RestController
public class welcomeController {


    @GetMapping("/index")
    @ApiOperation(value = "登陆欢迎", tags = "登陆")
    public String index(){

        return  "hello springBoot!";
    }


    @GetMapping(value = "/getUserInfo")
    @ApiOperation(value = "我的信息", tags = "用户")
    public Map<String,String> getUserInfo(HttpServletRequest request){
        Map<String,String> map =new HashMap<String,String>();
        map.put("name","唐煜");
        map.put("sex","男");
        map.put("age","25");
        return  map;
    }

}
