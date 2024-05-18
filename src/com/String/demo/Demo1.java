package com.String.demo;

public class Demo1 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    // 容量：最多装多少
    System.out.println(sb.capacity()); // 16
    // 长度：已经装了多少
    System.out.println(sb.length()); // 0

    sb.append("abcdefghijklmnopqrstuvwxyz");
    System.out.println(sb.capacity()); // 34
    System.out.println(sb.length());   // 26


  }
}
