package com.ArrayList.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo6 {
  public static void main(String[] args) {
    /*
     *  定义一个集合，添加一些学生对象，并进行遍历
     *  学生类的属性为：姓名，年龄
     *  要求：对象的数据来自键盘录入
     * */

    ArrayList<Student> list = new ArrayList<>();

    // 键盘录入学生的信息并添加到集合当中去
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      Student stu = new Student();
      System.out.println("请输入学生的名字");
      String name = scanner.next();
      System.out.println("请输入学生的年龄");
      int age = scanner.nextInt();

      stu.setName(name);
      stu.setAge(age);
      list.add(stu);
    }

    for(Student stu: list) {
      System.out.println(stu.getName()+", "+ stu.getAge());
    }

  }
}
