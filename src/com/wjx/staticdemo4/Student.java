package com.wjx.staticdemo4;

public class Student {
  String name;
  int age;
  static String teacherName;

  public void show1(Student this) {
    System.out.println(name);
  }

  public static void method() {
    System.out.println();
  }
}
