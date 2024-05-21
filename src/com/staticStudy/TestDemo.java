package com.staticStudy;

import java.util.ArrayList;

public class TestDemo {
  public static void main(String[] args) {
    // 测试工具类中的两个方法是否正确

    int[] arr1 = {1,2,3,4,5};
    String str =  ArrayUtil.printArr(arr1);
    System.out.println(str);

    double[] arr2 = {1.5,2.2,3.7,4.9,5.2};
    double avg = ArrayUtil.getAverage(arr2);
    System.out.println(avg);

    ArrayList<Student> list = new ArrayList<>();
    Student stu1 = new Student("wjx",19,"男");
    Student stu2 = new Student("xjc",29,"男");

    list.add(stu1);
    list.add(stu2);

    int res = ArrayUtil.getMaxAge(list);
    System.out.println(res);

  }
}
