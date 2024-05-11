package com.array.demo;

import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] copyArr = copyOfRange(arr, 0, 3);
    System.out.println(Arrays.toString(copyArr));
  }


  /*
   * 定义一个方法copyOfRange(int[] arr,int from,int to)
   * 将数组arr中从索引from开始，到索引to结束的元素复制到新数组中，将新数组返回
   * */
  public static int[] copyOfRange(int[] original, int from, int to) {
    // 1.定义数组
    int[] newArr = new int[to - from];
    int index = 0;
    // 2.把原始数组arr中的from到to上对应的元素 直接拷贝到newArr中
    for (int i = from; i < to; i++) {
      newArr[index] = original[i];
      index++;
    }
    return newArr;
  }

}
