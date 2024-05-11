package com.wjx.demo2;

public class GirlFriend {
  // 属性
  String name;
  int age;
  String gender;


  // TODO: 如果我们没有写任何的构造方法 那么虚拟机给我们加一个空参构造方法
  public GirlFriend() {
    System.out.println("看看我执行了什么");
  }


  // 有参构造
  public GirlFriend(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }


  // 针对每个私有化的成员变量 提供 get和 set方法
  public void setName(String n) {
    name = n;
  }

  // 作用：对外提供name属性的
  public String getName() {
    return name;
  }


  // 行为
  public void sleep() {
    System.out.println("睡觉");
  }

  public void eat() {
    System.out.println("吃饭");
  }
}
