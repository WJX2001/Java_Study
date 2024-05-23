package com.wjx.test9;

public class Lecturer extends Teacher{


  @Override
  public void work() {
    super.work();
    System.out.println("讲师在讲课");
  }
}
