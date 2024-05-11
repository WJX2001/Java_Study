package com.wjx.test6;

public class StudentTest {

  public static void main(String[] args) {
    // 首先定义一个长度为3的数组，数组存储1-3名学生对象作为初始数据
    Student[] arr = new Student[3];

    // 创建初始数据
    Student s1 = new Student(1, "王吉祥", 22);
    arr[0] = s1;

    // 再次添加一个学生对象(如果重复了不添加，没重复添加)
    Student newStu = new Student(1,"高振",23);

    boolean flag = containFlag(arr,s1.getId());
    if(flag) {
      System.out.println("重复了");
    }else {

    }


  }

  public static boolean containFlag(Student[] arr, int id) {
    for (Student stu : arr) {
      if (stu.getId() == id) {
        return true;
      }
    }
    return false;
  }

}
