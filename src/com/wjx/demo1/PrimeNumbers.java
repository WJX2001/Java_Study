package com.wjx.demo1;

import java.util.Scanner;

public class PrimeNumbers {

  // 键盘录入一个数字 判断是否为质数
  public void isPrime(int num) {

    boolean flag = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        flag = false;
        break;
      }
    }

    if(flag) {
      System.out.println(num + "是一个质数");
    }else {
      System.out.println(num+"不是");
    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("输入一个质数");
    int num = scanner.nextInt();
    PrimeNumbers primeNumbers = new PrimeNumbers();
    primeNumbers.isPrime(num);
  }

}
