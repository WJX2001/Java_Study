package com.wjx.demo1;

public class LeetCode204_CountPrimeNum {

  // 判断整数是否是一个素数
  boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  int countPrime(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        if (isPrime(i)) {
          count++;
        }
      }

    }
    return count;
  }

  public static void main(String[] args) {
    LeetCode204_CountPrimeNum mainFunc = new LeetCode204_CountPrimeNum();

  }


}
