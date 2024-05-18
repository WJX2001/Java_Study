package com.wjx.demo3;

import java.util.Scanner;

public class StringPractice2 {
  public static void main(String[] args) {
    // 1. 创建两个字符串对象
    String s1 = new String("abc");
    String s2 = "abc";

    // 2. == 号比较
    // 基本数据类型 比的是数值
    // 引用数据类型 比的是地址值
    System.out.println(s1 == s2);

    // 3. 比较字符串中的内容是否相等
    boolean res1 = s1.equals(s2);
    System.out.println(res1); // true

    // 4. 比较字符串中的内容是否相等 忽略大小写
    boolean res2 = s1.equalsIgnoreCase(s2);
    System.out.println(res2); // true

    // 5. 键盘录入一个abc
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个字符串");
    String str1 = sc.next();

    // 在定义一个字符串abc
    String str2 = "abc";
    // 用等号比较
    System.out.println(str1 == str2); // false

  }
}
