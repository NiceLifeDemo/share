 package com.techrc.controller.login;

 import com.techrc.domain.ResponseBo;
 import com.techrc.dto.UserInfoDTO;
 import com.techrc.model.User;
 import com.techrc.service.UserService;
 import com.techrc.util.StringUtils;
 import com.techrc.util.vcode.Captcha;
 import com.techrc.util.vcode.GifCaptcha;
 import io.swagger.annotations.ApiOperation;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import javax.validation.Valid;
 import javax.websocket.Session;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.*;


 @Controller
 public class LoginController {

     @Autowired
     private UserService userService;



     @GetMapping("/login")
     public String login() {

         return "login";
     }



     @PostMapping("/doLogin")
     @ResponseBody
     public ResponseBo doLogin(String realName, String password, String code, Boolean rememberMe,HttpSession session) {
         if (!StringUtils.hasValue(code)) {
             return ResponseBo.warn("验证码不能为空！");
         }

         String sessionCode = (String) session.getAttribute("_code");
         if (!code.toLowerCase().equals(sessionCode)) {
             return ResponseBo.warn("验证码错误！");
         }

           User user= userService.findUserByBNameAndPassword(realName,password);
           if(user!=null){
               return ResponseBo.ok();
           }else {
             return ResponseBo.error("认证失败！");
           }

     }

     @GetMapping(value = "gifCode")
     public void getGifCode(HttpServletResponse response, HttpServletRequest request,HttpSession session) {
         try {
             response.setHeader("Pragma", "No-cache");
             response.setHeader("Cache-Control", "no-cache");
             response.setDateHeader("Expires", 0);
             response.setContentType("image/gif");

             Captcha captcha = new GifCaptcha(146, 33, 4);
             captcha.out(response.getOutputStream());

             session.removeAttribute("_code");
             session.setAttribute("_code", captcha.text().toLowerCase());

         } catch (Exception e) {
             e.printStackTrace();
         }
     }


   @GetMapping({"/index"})
   @ApiOperation(value="", tags={"首页"})
   public String index(Model model) {
      User user= userService.findCurrentUser();
       model.addAttribute("user", user);
    return "index";
   }



   @PostMapping({"/dologin"})
   @ApiOperation(value="登陆", tags={"首页"})
   @ResponseBody
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

