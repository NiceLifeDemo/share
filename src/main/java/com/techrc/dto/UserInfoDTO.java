 package com.techrc.dto;

 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;

 @ApiModel
public class UserInfoDTO
{
  @ApiModelProperty("账号")
  private String userName;
  @ApiModelProperty("密码")
  private String password;

   public String getUserName()
   {
     return this.userName;
   }

   public void setUserName(String userName) {
/* 25 */     this.userName = userName;
/*    */   }

   public String getPassword() {
/* 29 */     return this.password;
/*    */   }

   public void setPassword(String password) {
/* 33 */     this.password = password;
/*    */   }
 }
