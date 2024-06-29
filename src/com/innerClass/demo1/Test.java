package com.innerClass.demo1;

public class Test {
  public static void main(String[] args) {

    Outer o = new Outer();

    // 方法一：
    Object inner = o.getInstance();

    System.out.println(inner);
  }
}
