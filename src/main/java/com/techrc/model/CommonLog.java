package com.techrc.model;

import java.io.Serializable;

public class CommonLog implements Serializable
 {
   private String tag;
   private String content;

   public String getTag()
  {
    return this.tag;
  }

   public void setTag(String tag) {
    this.tag = tag;
  }

  public String getContent() {
    return this.content;
  }

   public void setContent(String content) {
    this.content = content;
  }
}

