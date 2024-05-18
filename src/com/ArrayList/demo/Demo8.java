package com.ArrayList.demo;

import java.util.ArrayList;

public class Demo8 {

  public static void main(String[] args) {
    // 存三个手机对象
    ArrayList<Phone> list = new ArrayList<>();

    Phone ph1 = new Phone("小米", 1000);
    Phone ph2 = new Phone("苹果", 8000);
    Phone ph3 = new Phone("锤子", 2999);

    list.add(ph1);
    list.add(ph2);
    list.add(ph3);

    String res = getDetail(list);
    System.out.println(res);
  }

  public static String getDetail(ArrayList<Phone> list) {
    for (Phone item : list) {
      if (item.getPrice() < 3000) {
        return item.getBrand() + ", " + item.getPrice();
      }
    }
    return null;
  }
}
