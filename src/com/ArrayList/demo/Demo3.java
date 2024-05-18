package com.ArrayList.demo;

import java.util.ArrayList;

public class Demo3 {
  public static void main(String[] args) {
    // TODO: 定义一个集合，添加字符串，并进行遍历，遍历格式参照 [元素1，元素2，元素3]
    ArrayList<String> list = new ArrayList<>();
    list.add("abc");
    list.add("def");
    list.add("ghi");
    getArrayList(list);

  }


  public static void getArrayList(ArrayList<String> list) {
    System.out.print("[");
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
