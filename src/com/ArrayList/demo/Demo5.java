package com.ArrayList.demo;

import java.util.ArrayList;

public class Demo5 {
  public static void main(String[] args) {
    /*
    * 定义一个集合，添加一些学生对象，并进行遍历
    * 学生类的属性为：姓名，年龄
    * */

    // 1. 创建集合
    ArrayList<Student> list = new ArrayList<>();

    // 2. 创建学生对象
    Student s1 = new Student("张三",23);
    Student s2 = new Student("李四",24);
    Student s3 = new Student("王五",26);

    // 3.添加元素
    list.add(s1);
    list.add(s2);
    list.add(s3);

    // 4.遍历集合
    for (Student stu : list) {
      // i 索引
      System.out.println(stu.getName() + ", " + stu.getAge());
    }
  }
}
