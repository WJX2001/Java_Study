package com.String.demo;

public class Demo3 {
  public static void main(String[] args) {
    /*
     * 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，他们的乘积也表示为字符串形式
     * */
    String num1 = "23";
    String num2 = "46";

    // TODO: 1.将num1和num2变成整数 相乘然后变成字符串，遍历得到每个字符变成数字
    getNum(num1, num2);
    // TODO: 2.使用Integer.parseInt的方式
    getNum2(num1, num2);
  }

  public static void getNum(String str1, String str2) {
    int numParam1 = 0;
    int numParam2 = 0;
    for (int i = 0; i < str1.length(); i++) {
      int num1 = str1.charAt(i) - '0';
      numParam1 = numParam1 * 10 + num1;
    }
    for (int i = 0; i < str2.length(); i++) {
      int num2 = str2.charAt(i) - '0';
      numParam2 = numParam2 * 10 + num2;
    }
    System.out.println(numParam1 * numParam2);
  }

  public static void getNum2(String str1, String str2) {
    int number1 = Integer.parseInt(str1);
    int number2 = Integer.parseInt(str2);
    int product = number1 * number2;
    System.out.println(String.valueOf(product));
  }

}
