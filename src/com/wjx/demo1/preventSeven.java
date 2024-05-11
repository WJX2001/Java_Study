package com.wjx.demo1;

// 100内逢七过
public class preventSeven {
  public static void main(String[] args) {
    int num = 100;
    for(int i = 0; i <= 100; i++) {
        if(i % 10 == 7 || i /10 % 7 == 0 || i % 7 == 0) {
          System.out.println("过");
          continue;
        }
      System.out.println(i);
    }
  }
}
