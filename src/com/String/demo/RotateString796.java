package com.String.demo;

/*
 * 调整字符串
 * 给定两个字符串，A和B
 * A的旋转操作就是将A最左边的字符移动到最右边
 * 例如 若A='abcde',在移动一次之后结果就是'bcdea'
 * 如果能在若干次操作之后，A能变成B，那么返回true
 * 如果不能匹配成功，则返回false
 * */

public class RotateString796 {
  public static void main(String[] args) {
    // 1.定义两个字符串
    String strA = "abcde";
    String strB = "cdeab";

    // 2.调用方法进行比较
    boolean result = check(strA,strB);

    System.out.println(result);
  }

  // 循环遍历
  public static boolean check(String strA, String strB) {
    for (int i = 0; i < strA.length(); i++) {
      strA = rotateString(strA);
      if(strB.equals(strA)){
        return true;
      }
    }
    // 所有情况都比较完毕
    return false;
  }

  // 将字符修改
  public static String rotateString(String s) {
    // 套路：如果看到要修改字符串的内容，可以有两个办法：
    // 1.用subString进行截取，把左边的字符截取出来拼接到右侧
    // 2.可以把字符串先变成一个字符数组，然后调整字符数组里面数据，最后再把字符数组变成字符串

    // TODO: 截取思路
    String first = s.substring(0, 1);
    String second = s.substring(1);
    return second + first;




  }
}
