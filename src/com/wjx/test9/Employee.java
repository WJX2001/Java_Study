package com.wjx.test9;

public class Employee {
  private int id;
  private String name;

  public Employee() {
  }

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // 工作方法
  public void work() {
    System.out.println("员工在工作");
  }

}
