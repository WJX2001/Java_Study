package com.wjx.a01polymorphismdemo3;

public class Person {
  private String name;
  private int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

//  // 饲养狗
//  public void keepPet(Dog dog, String something) {
//    System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
//    dog.eat(something);
//  }
//
//  // 饲养猫
//  public void keepPet(Cat cat, String something) {
//    System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
//    cat.eat(something);
//  }

  // TODO: 使用多态来简化代码

  // 想要一个方法，能接收所有的动物，包括猫，包括狗
  public void keepPet(Animal a, String something) {
    if(a instanceof Dog d) {
      System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的狗");
      a.eat(something);
      d.lookHome();
    }else if(a instanceof Cat c) {
      System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的猫");
      a.eat(something);
      c.catchMouse();
    }


  }


}
