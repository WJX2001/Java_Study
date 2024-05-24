package com.objectOriented.InterfaceStudy.demo3;

public abstract class Sporter extends People{

  public Sporter() {
  }

  public Sporter(String name, int age) {
    super(name, age);
  }

  public abstract void Study();
}
