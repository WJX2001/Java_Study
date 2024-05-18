package com.String.demo;

/*
 * 生成验证码：
 *   内容：可以是小写字母，也可以是大写字母，还可以是数字
 *   规则：长度为5，内容中是四位字母，1位数字
 *   其中数字只有1位，但是可以出现在任意的位置。
 * */

import java.util.Random;

public class Demo2 {
  public static void main(String[] args) {
    // 1.可以把所有的大写字母，小写字母都放到一个数组中
    char[] arr = new char[52]; // a-z A-Z char[] arr = new char[52]; // a-z A-Z
    for (int i = 0; i < 26; i++) {
      arr[i] = (char) ('a' + i);
    }

    for (int i = 0; i < 26; i++) {
      arr[26 + i] = (char) ('A' + i);
    }
    StringBuilder sb = new StringBuilder();
    // 2.从数组中随机获取四次
    Random r = new Random();
    for (int i = 0; i < 4; i++) {
      int randomIndex = r.nextInt(arr.length);
      sb.append(arr[randomIndex]);
    }
    // 3.生成一个0～9之间的随机数拼接到最后
    // ACFG7 把生成的验证码变成一个字符数组，再让最后一个元素跟前面的随机位置的元素交换位置即可
    int randomNum = r.nextInt(10);
    sb.append(randomNum);
    // TODO: 进行交换
    System.out.println(swap(sb.toString()));
  }

  public static String swap(String str) {
    Random r = new Random();
    int randomNum = r.nextInt(str.length() - 1);
    char[] arr = str.toCharArray();
    char temp = arr[arr.length - 1];
    arr[arr.length - 1] = arr[randomNum];
    arr[randomNum] = temp;
    return new String(arr);
  }
}
