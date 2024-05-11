package com.array.demo;

import java.util.Arrays;
import java.util.Random;

public class ScrambleArr {

  // 打乱数组中的数据
  public int[] scrambleArr(int[] arr) {
    Random r = new Random();
    // 遍历索引 进行交换
    for (int i = 0; i < arr.length; i++) {
      // 生成一个随机索引
      int randomIndex = r.nextInt(arr.length);

      int temp = arr[i];
      arr[i] = arr[randomIndex];
      arr[randomIndex] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    ScrambleArr scrambleArr = new ScrambleArr();
    int[] res = scrambleArr.scrambleArr(arr);
    System.out.println(Arrays.toString(res));

  }
}
