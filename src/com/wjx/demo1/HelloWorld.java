package com.wjx.demo1;

public class HelloWorld {
  public static void main(String[] args) {

    // TODO: 隐式转换
    // 取值范围小的会先提升为大的再进行计算
    int a = 10;
    double b = 12.3;

    double c = a + b;
    System.out.println(c); // 22.3

    // byte short char 三种类型在计算的时候，会先提升为int 然后再计算
    byte a1 = 10;
    byte b2 = 20;

    // TODO: 强制转换
    byte b1 = 100;
    byte b3 = 100;

    byte result = (byte) (b1 + b2);
    System.out.println(result);// 结果发生错误 因为要转换的数据过大

    System.out.println('a'+1);

  }
}
