package com.wjx.test5;

public class GrilFriendTest {
  public static void main(String[] args) {

    // 1. 首先创建一个数组
    GirlFriend[] arr = new GirlFriend[3];

    GirlFriend g1 = new GirlFriend("aa",14,"女","fuck");
    GirlFriend g2 = new GirlFriend("ab",16,"女","fuck");
    GirlFriend g3 = new GirlFriend("ac",18,"女","fuck");

    // 把对象添加到数组中
    arr[0] = g1;
    arr[1] = g2;
    arr[2] = g3;

    // 求和
    int sum = 0;
    for(int i = 0;i<arr.length;i++){
      sum += arr[i].getAge();
    }

    // 平均值
    int avg = sum/arr.length;

    int count = 0;
    // 统计年龄低比平均值低的有几个 打印信息
    for(int i = 0;i<arr.length;i++){
      if(arr[i].getAge() < avg) {
        count++;
      }
    }
    System.out.println(count);
  }
}
