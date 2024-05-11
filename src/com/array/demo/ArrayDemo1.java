package com.array.demo;

public class ArrayDemo1 {
  public static void main(String[] args) {
    // 数据类型 [] 数组名 = new 数据类型[]{元素1，元素2....}

    int[] arr1 = new int[]{11, 12, 31};
    System.out.println(arr1); // [I@2a84aee7 打印的是数组的地址值

    // 扩展
    // TODO: 解释下地址值的格式含义 [I@2a84aee7
    /*
    * [：表示当前是一个数组
    * I：表示当前数组里面的元素都是int类型的
    * @：表示一个间隔符号（固定格式）
    * 2a84aee7 才是数组真正的地址值（十六进制）
    * */


    // 动态声明数组
    // 数据类型[] 数组名 = new 数据类型[数组的长度]
    // 在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值




  }
}
