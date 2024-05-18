package com.String.demo;

public class Demo4 {
  public static void main(String[] args) {
    /*
     * 给你一个字符串s，由若干个单词组成，单词前后用一些空格字符隔开
     * 返回字符串最后一个单词长度
     * 单词是仅由字母组成，不包含任何空格字符的最大子字符串
     * */

    // 倒着遍历
    String s = " Hello World ";

    int index = s.length()-1;
    while (s.charAt(index) == ' ') {
      index--;
    }

    int wordLength = 0;
    while (index >=0 && s.charAt(index) != ' ') {
      wordLength++;
      index--;
    }
    System.out.println(wordLength);
  }
}
