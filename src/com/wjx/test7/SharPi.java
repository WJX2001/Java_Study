package com.wjx.test7;

public class SharPi extends Dog {

  // 父类的方法不能满足我们的需求，所以需要重写
  @Override
  public void eat() {
//    super.eat();
    System.out.println("吃骨头");
  }
}
