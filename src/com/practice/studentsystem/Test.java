package com.practice.studentsystem;

import java.util.ArrayList;
import java.util.Random;

public class Test {
  public static void main(String[] args) {
    String res = getCode();
    System.out.println(res);
  }

  private static String getCode() {
    // 1.创建一个集合添加所有的大写和小写字母
    ArrayList<Character> list = new ArrayList<>();
    for (int i = 0; i < 26; i++) {
      list.add((char) ('a' + i));
      list.add((char) ('A' + i));
    }

    StringBuilder sb = new StringBuilder();
    // 2.随机抽取4个字符
    Random r = new Random();
    for (int i = 0; i < 4; i++) {
      // 获取随机索引
      int index = r.nextInt(list.size());

      // 利用随机索引获取随机字符
      char c = list.get(index);
      sb.append(c);
    }

    // 3.把一个随机数字添加到末尾
    int randomNum = r.nextInt(10);
    sb.append(randomNum);

    // 4.将数字出现在任意位置
    // 先把字符串变成字符数组 然后变成一个字符串

    char[] arr = sb.toString().toCharArray();
    // 拿着最后一个索引和随机索引进行交换
    int randomNumArr = r.nextInt(arr.length);
    char tmp = arr[arr.length - 1];
    arr[arr.length - 1] = arr[randomNumArr];
    arr[randomNumArr] = tmp;

    return new String(arr);
  }
}
