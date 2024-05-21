package com.staticStudy;

import java.util.ArrayList;

public class ArrayUtil {

  // 私有化构造方法
  // 目的：为了不让外界创建他的对象
  private ArrayUtil() {
  }


  // 需要定义为静态的，方便调用
  public static String printArr(int[] arr) {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        sb.append(arr[i]);
      } else {
        sb.append(arr[i]).append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }

  // 返回平均值
  public static double getAverage(double[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum / arr.length;
  }

  // 获取最大学生的年龄
  public static int getMaxAge(ArrayList<Student> studentList) {
    int maxAge = 0;
    for (Student student : studentList) {
      if(student.getAge() > maxAge) {
        maxAge = student.getAge();
      }
    }
    return maxAge;
  }

}
