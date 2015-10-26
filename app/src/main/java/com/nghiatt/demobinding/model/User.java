package com.nghiatt.demobinding.model;

public class User {
  private String name;
  private boolean isHappy;

  public User(String name) {
    this.name = name;
    this.isHappy = true;
  }

  public User(String name, boolean isHappy) {
    this.name = name;
    this.isHappy = isHappy;
  }

  public boolean isHappy() {
    return isHappy;
  }

  public void setIsHappy(boolean isHappy) {
    this.isHappy = isHappy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
