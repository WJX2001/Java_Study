package com.innerClass.demo1;

public class Outer {

  private class Inner{

  }


  public Inner getInstance() {
    return new Inner();
  }
}
