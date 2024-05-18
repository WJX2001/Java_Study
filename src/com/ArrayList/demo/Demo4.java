package com.ArrayList.demo;

import java.util.ArrayList;

public class Demo4 {
  public static void main(String[] args) {
    // TODO: 定义一个集合，添加数字，并进行遍历。 遍历格式参照: [元素1，元素2，元素3]

    // 1.创建集合
    ArrayList<Integer> list = new ArrayList<>();

    // 2.添加元素
    // jdk5之后，int Integer之间是可以互相转化的

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.print("[");
    // 遍历集合
    for (int i = 0; i < list.size(); i++) {
      if (i == list.size() - 1) {
        System.out.print(list.get(i));
      } else {
        System.out.print(list.get(i) + ", ");
      }
    }
    System.out.print("]");
  }
}
