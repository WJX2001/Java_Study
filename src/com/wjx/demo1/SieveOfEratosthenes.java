package com.wjx.demo1;

import java.util.Arrays;

public class SieveOfEratosthenes {
  int countPrimes(int n) {
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, true);
    for (int i = 2; i < n; i++) {
      if (isPrime[i]) {
        // i的倍数不可能为素数
        for (int j = 2 * i; j < n; j += i)
          isPrime[j] = false;
      }
    }

    int count = 0;
    for (int i = 2; i < n; i++)
      if (isPrime[i]) count++;
    return count;
  }


  public static void main(String[] args) {

  }

}
