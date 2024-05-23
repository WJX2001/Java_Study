package com.wjx.test9;

public class Tutor extends Teacher {

  public Tutor() {
  }

  public Tutor(int id,String name) {
    super(id,name);
  }


  @Override
  public void work() {
    super.work();
    System.out.println("助教在助教");
  }

}
