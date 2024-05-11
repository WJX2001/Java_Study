package com.array.demo;

import java.util.Arrays;
import java.util.Random;

public class IterateArrayAndSum {

  // 求出所有数据的和
  public int add(int[] arr) {
    int sum = 0;
    for (int j : arr) {
      sum += j;
    }
    return sum;
  }

  // 求所有数据的平均数
  public int average(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum / arr.length;
  }

  // 统计多少个数据比平均值小
  public int countNum(int[] arr) {
    // 首先计算平均值
    int sum = 0;
    int avg = 0;
    int count = 0;
    for (int i : arr) {
      sum += i;
    }
    avg = sum / arr.length;
    for (int j : arr) {
      if (j < avg) {
        count++;
      }
    }
    return count;
  }

  // 实现头尾交换
  public int[] swap(int[] arr) {
    for(int i=0,j=arr.length-1;i<j;i++,j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = new int[10];
    int[] arr1 = {1,2,3,4,5};

    for (int i = 0; i < 10; i++) {
      Random random = new Random();
      arr[i] = random.nextInt(100) + 1;
    }
    IterateArrayAndSum iterateArrayAndSum = new IterateArrayAndSum();
    int sum = iterateArrayAndSum.add(arr);
    int average = iterateArrayAndSum.average(arr);
    int count = iterateArrayAndSum.countNum(arr);

    System.out.println(sum);
    System.out.println(average);
    System.out.println(count);

    System.out.println(Arrays.toString(iterateArrayAndSum.swap(arr1)));
  }

}
