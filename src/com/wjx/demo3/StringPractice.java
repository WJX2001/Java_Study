package com.wjx.demo3;

public class StringPractice {
  public static void main(String[] args) {
    // TODO: 声明字符串的几种方法

    // 1. 使用直接赋值的方式获取一个字符串对象
    String s1 = "abc";
    System.out.println(s1);

    // 2. 使用new的方式来获取一个字符串对象
    String s2 = new String("abc");
    System.out.println(s2);

    // 3. 传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
    char[] chs = {'a', 'b', 'c'};
    String s3 = new String(chs);
    System.out.println(s3);

    // 4. 传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
    // 应用场景，以后再网络当中传输的数据其实都是字节信息
    // 我们一般要把字节信息进行转换，专程字符串，此时就要用到这个构造
    byte[] bytes = {97, 98, 99, 100};
    String s4 = new String(bytes);
    System.out.println(s4);  //  abcd

  }
}
