package com.greenfox.groot.models;


/**
 * Created by Connor on 2017.05.15..
 */

public class Groot {

  private String received;
  private String translated;

  public Groot(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
