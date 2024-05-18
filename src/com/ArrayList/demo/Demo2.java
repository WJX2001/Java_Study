package com.ArrayList.demo;

import java.util.ArrayList;

public class Demo2 {
  public static void main(String[] args) {

    // 1.创建一个集合
    ArrayList<String> list = new ArrayList<>();

    // 2.添加元素
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");

    // 3.删除元素
    list.remove("bb");
    list.remove(1);

    // 4.修改元素
    list.set(0,"sss");

    // 5.查询元素
    list.get(0);

    // 6.遍历
    for (String str : list) {
      // i索引
      // list.get(i) 元素
      System.out.println(str);
    }

    System.out.println(list);
  }
}
