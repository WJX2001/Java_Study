package com.String.demo;

/*
 *   键盘录入一个字符串
 *   要求一：长度为小于等于9
 *   要求二：只能是数字
 *   将内容变成罗马数字
 *   下面是阿拉伯数字跟罗马数字的对比关系
 *       I - 1、II - 2、III - 3、IV - 4、 V - 5、 VI - 6、 VII - 7 、VIII - 8、IX - 9 、
 *   注意点：罗马数字里面是没有0的，如果键盘录入的数字包含0，可以变成""（长度为0的字符串）
 * */


import java.util.Scanner;
import java.util.StringJoiner;

public class RomanNumbers {


  public static void main(String[] args) {
    // 1.键盘录入一个字符串
    Scanner scanner = new Scanner(System.in);
    String romanString;
    StringJoiner s = new StringJoiner(", ");
    while (true) {
      System.out.println("请输入一个字符串");
      romanString = scanner.nextLine();
      // 2.校验字符串是否满足规则
      boolean flag = checkStr(romanString);
      if (flag) {
        break;
      } else {
        System.out.println("当前的字符串不符合规则，请重新输入");
      }
    }

    for (int i = 0; i < romanString.length(); i++) {
      char c = romanString.charAt(i);
      int number = c - 48;
      String res = changeLuoMa(number);
      s.add(res);
    }

    System.out.println(s);
  }

  // 转为罗马数字
  public static String changeLuoMa(int number) {
    // 定义一个数组 让索引和罗马数字产生一个对应关系
    String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return arr[number];
  }


  // 检查字符串函数
  public static boolean checkStr(String str) {
    // 要求一：长度为小于等于9
    if (str.length() > 9) {
      System.out.println("长度小于等于9");
      return false;
    }

    // 要求二：只能是数字
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c < '0' || c > '9') {
        System.out.println("只能是0到9之间的数字");
        return false;
      }
    }
    // 当所有字符全部判断完毕，才能判断当前字符是否合规
    return true;
  }
}
