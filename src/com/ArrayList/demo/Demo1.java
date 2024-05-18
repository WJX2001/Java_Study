package com.ArrayList.demo;

import java.util.ArrayList;

public class Demo1 {
  public static void main(String[] args) {
    // 1.创建集合的对象
    // 使用泛型：限定集合中存储数据的类型

    // 老版本写法
    // ArrayList<String> list = new ArrayList<String>();

    // JDK7以后:
    ArrayList<String> list = new ArrayList<>();

    /*
    * 此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
    *   这个类在底层做了一些处理
    *   打印对象不是地址值，而是集合中存储数据内容
    *   在展示的时候会拿[]把所有的数据进行包裹
    * */



  }
}
