 package com.techrc.dto;

import io.swagger.annotations.ApiModel;
/*    */ import io.swagger.annotations.ApiModelProperty;

@ApiModel
 public class CommLogDTO
 {
  @ApiModelProperty(value="标签", example="mysql")
  private String tag;
   @ApiModelProperty(value="内容", example="mysql从删库到跑路")
  private String content;

   public String getTag()
   {
    return this.tag;
  }

  public void setTag(String tag) {
/* 24 */     this.tag = tag;
/*    */   }

   public String getContent() {
/* 28 */     return this.content;
/*    */   }
   public void setContent(String content) {
/* 32 */     this.content = content;
/*    */   }

}


