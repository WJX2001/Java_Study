package com.String.demo;

import java.util.Random;
import java.util.Scanner;

public class RandomStr {
  public static void main(String[] args) {
    // 键盘输入任意字符串，打乱里面的内容

    // 1. 键盘输入任意字符串
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入任意字符串");
    String str = scanner.nextLine();

    // 2.TODO: 变成字符数组
    char[] arr = str.toCharArray();
    char t;
    Random random = new Random();
    // 3.打乱数组里的内容 从0索引开始跟一个随机索引进行位置交换
    for (int i = 0; i < arr.length; i++) {
      int randomIndex = random.nextInt(arr.length);
      t = arr[i];
      arr[i] = arr[randomIndex];
      arr[randomIndex] = t;
    }
    System.out.println(new String(arr));
  }
}
