package com.wjx.demo3;

import java.util.StringJoiner;

public class StringDemo5 {
  public static void main(String[] args) {

    // 1. 创建一个对象，并指定中间的间隔符号
    StringJoiner sj = new StringJoiner("---");

    // 2. 添加元素
    sj.add("aaa").add("bbb").add("ccc").add("ddd");

    // 3. 打印结果
    System.out.println(sj);
  }
}
