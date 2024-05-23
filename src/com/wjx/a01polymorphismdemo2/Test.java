package com.wjx.a01polymorphismdemo2;

public class Test {
  public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();


    // 解决方案一：
//    Dog d = (Dog) dog;
//    d.sleep();

    // 解决方案二：

//    if(dog instanceof Dog){
//      Dog dog1 = (Dog) dog;
//      dog1.sleep();
//    }

    // 解决方案三： 新特性
//    if(dog instanceof Dog d) {
//      d.sleep();
//    }


  }
}


class Animal {
  public void eat() {
    System.out.println("动物在吃东西");
  }
}

class Dog extends Animal {
  @Override
  public void eat() {
    System.out.println("狗在吃骨头");
  }

  public void sleep() {
    System.out.println("狗在睡觉");
  }
}


class Cat extends Animal {
  @Override
  public void eat() {
    System.out.println("猫在吃鱼");
  }
}
