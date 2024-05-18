package com.wjx.demo3;


import java.util.StringJoiner;

public class StringDemo6 {

  public static void main(String[] args) {
    // 1. 创建对象
    StringJoiner sj = new StringJoiner(", ","[","]");

    // 2.添加元素
    sj.add("aaa").add("bbb").add("ccc").add("ddd");

    int len = sj.length();
    System.out.println(len);

    String s = sj.toString();

    System.out.println(sj); // [aaa, bbb, ccc, ddd]
  }
}
