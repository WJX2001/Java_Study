package com.wjx.demo3;

import java.util.Scanner;

public class StringDemo3 {
  public static void main(String[] args) {


    // 1.定义两个变量记录正确的用户名和密码
    String rightUsername = "zhangsan";
    String rightPassword = "123456";
    int i = 0;
    while (i<3) {
      // 2.键盘录入用户名和密码
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入用户名");
      String username = sc.next();
      System.out.println("请输入密码");
      String password = sc.next();

      // 3.比较
      if (username.equals(rightUsername) && password.equals(rightUsername)) {
        System.out.println("用户登陆成功");
        break;
      } else {
        System.out.println("用户登录失败，用户名或密码有误");
        i++;
      }
    }
  }
}

