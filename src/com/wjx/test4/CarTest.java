package com.wjx.test4;

import java.util.Scanner;

public class CarTest {

  public static void main(String[] args) {

    // 1.创建一个数组
    Car[] arr = new Car[3];

    // 2.创建汽车对象，数据来自于键盘录入
    Scanner scanner = new Scanner(System.in);
    for(int i=0;i<arr.length;i++) {
      // 创建汽车的对象
      Car c = new Car();
      // 录入品牌
      System.out.println("请输入汽车的品牌");
      String brand = scanner.next();
      c.setBrand(brand);

      // 录入价格
      System.out.println("请输入汽车的价格");
      double price = scanner.nextDouble();
      c.setPrice(price);

      // 录入颜色
      System.out.println("请输入汽车的颜色");
      String color = scanner.next();
      c.setColor(color);

      // 把汽车对象添加到数组中
      arr[i] = c;
    }

    // 3.遍历数组
    for(int i=0;i<arr.length;i++) {
      Car car = arr[i];
      System.out.println(car.getBrand()+" "+car.getPrice()+" "+car.getColor());
    }
  }
}
