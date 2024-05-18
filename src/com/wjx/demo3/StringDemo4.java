package com.wjx.demo3;

import java.util.Scanner;

public class StringDemo4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入字符串");
    String str = sc.next();

    String res = reverse(str);
    System.out.println(res);
  }

  // 实现字符串反转

  public static String reverse(String str) {
    StringBuilder res = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      res.append(str.charAt(i));
    }
    return res.toString();
  }
}
