package com.array.demo;

import java.util.Random;

public class HongBao {
  public static void main(String[] args) {
    int[] arr = {2, 588, 888, 1000, 10000};
    getRes(arr);
  }

  public static void getRes(int[] arr) {
    int[] newArr = new int[arr.length];
    for (int i = 0; i < 5; ) {
      // 获取随机索引
      int randomNum = new Random().nextInt(arr.length);
      // 获取奖项
      int prize = arr[randomNum];

      // 判断当前的奖项是否存在，如果存在则重新抽取，如果不存在 就表示是有效奖项
      boolean flag = contains(newArr, prize);
      if(!flag) {
        newArr[i] = prize;
        // 添加完毕后 移动索引
        i++;
      }
    }
    // 4.遍历newArr
    for(int i:newArr) {
      System.out.println(newArr[i]);
    }


  }


  // 判断prize在数组中是否存在
  public static boolean contains(int[] arr, int price) {
    for (int i : arr) {
      if (arr[i] == price) {
        return true;
      }
    }
    return false;
  }

}
