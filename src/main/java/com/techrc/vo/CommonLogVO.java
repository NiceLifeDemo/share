 package com.techrc.vo;

 import com.alibaba.fastjson.annotation.JSONField;
 import io.swagger.annotations.ApiModel;
 import io.swagger.annotations.ApiModelProperty;
 import java.util.Date;


 @ApiModel
 public class CommonLogVO
{
  @ApiModelProperty("标签")
   private String tag;
   @ApiModelProperty("内容")
   private String content;
   @ApiModelProperty("创建时间")
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date creatime;

   public String getTag()
  {
    return this.tag;
   }

  public void setTag(String tag) {
/* 33 */     this.tag = tag;
/*    */   }

   public String getContent() {
/* 37 */     return this.content;
/*    */   }

  public void setContent(String content) {
/* 41 */     this.content = content;
/*    */   }

  public Date getCreatime() {
/* 45 */     return this.creatime;
/*    */   }

   public void setCreatime(Date creatime) {
/* 49 */     this.creatime = creatime;
/*    */   }
}
