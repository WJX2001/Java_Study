package com.wjx.a01polymorphismdemo3;

public class Test {
  public static void main(String[] args) {
    Person p = new Person("老王",30);
    Dog d = new Dog(2,"黑");
    p.keepPet(d,"骨头");
    
    Person p2 = new Person("老李",31);
    Cat c = new Cat(3,"红");
    p2.keepPet(c,"鱼");
  }
}
