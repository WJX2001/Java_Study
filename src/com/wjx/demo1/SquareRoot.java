package com.wjx.demo1;

import java.util.Scanner;

public class SquareRoot {

  // 计算算数平方根
  public void sqrt(int x) {

    for(int i=1; i<=x; i++){
      if(i * i == x) {
        System.out.println(i+"就是"+x+"平方根");
        break;
      }else if(i * i >x) {
        System.out.println((i-1)+"就是"+x+"平方根");
        break;
      }
    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入一个数字");
    int n = scanner.nextInt();

    SquareRoot squareRoot = new SquareRoot();
    squareRoot.sqrt(n);
  }
}
