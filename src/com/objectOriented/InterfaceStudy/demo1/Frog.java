package com.objectOriented.InterfaceStudy.demo1;

import com.objectOriented.test3.Animal;

public class Frog extends Animal implements Swim {

  public Frog() {
  }

  public Frog(String name, int age) {
    super(name, age);
  }


  @Override
  public void swim() {
    System.out.println("青蛙在游泳");
  }

  @Override
  public void eat() {
    System.out.println("青蛙吃虫子");
  }
}
