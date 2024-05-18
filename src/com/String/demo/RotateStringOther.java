package com.String.demo;

public class RotateStringOther {
  public static void main(String[] args) {
    String strA = "abcde";
    String strB = "cdeab";

    // 2.调用方法进行比较
    boolean result = checkFunc(strA,strB);
    System.out.println(result);
  }

  public static boolean checkFunc(String s, String t) {
    for (int i = 0; i < s.length(); i++) {
      s = rotate(s);
      if(s.equals(t)){
        return true;
      }
    }
    return false;
  }


  // 首先对字符串进行旋转
  public static String rotate(String str) {
    // 使用数组的方式进行旋转
    char[] arr = str.toCharArray();
    // 拿到0索引上的字符
    char first = arr[0];
    // 把剩余的字符一次往前挪动一个位置
    for(int i=1;i<arr.length;i++){
      arr[i-1] = arr[i];
    }
    arr[arr.length-1] = first;
    return new String(arr);
  }


}
