package com.practice.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
  public static void startStudentSystem() {

    ArrayList<Student> list = new ArrayList<>();
    loop:
    while (true) {
      System.out.println("-------------------欢迎来到学生管理系统---------------------");
      System.out.println("1:添加学生");
      System.out.println("2:删除学生");
      System.out.println("3:修改学生");
      System.out.println("4:查询学生");
      System.out.println("5:退出");
      System.out.println("请输入您的选择");

      // 用户选择
      Scanner sc = new Scanner(System.in);
      String choose = sc.next();
      // 进行选择
      switch (choose) {
        case "1" -> addStudent(list);
        case "2" -> deleteStudent(list);
        case "3" -> updateStudent(list);
        case "4" -> queryStudent(list);
        case "5" -> {
          System.out.println("退出");
          //break loop;
          System.exit(0); // 停止虚拟机运行
        }
        default -> System.out.println("没有这个选项");
      }
    }
  }


  // 添加学生
  public static void addStudent(ArrayList<Student> list) {

    // 利用空参构造先创建学生对象
    Student s = new Student();

    Scanner sc = new Scanner(System.in);


    while (true) {
      System.out.println("请输入学生的id");
      String id = sc.next();
      boolean flag = contains(list, id);
      if (flag) {
        // 表示id已经存在 需要重新录入
        System.out.println("ID已经存在，请重新录入");
      } else {
        // 表示id不存在 可以使用
        // TODO: 实现ID唯一
        s.setId(id);
        break;
      }
    }

    System.out.println("请输入学生的姓名");
    String name = sc.next();
    s.setName(name);

    System.out.println("请输入学生的年龄");
    int age = sc.nextInt();
    s.setAge(age);

    System.out.println("请输入学生的家庭信息");
    String address = sc.next();
    s.setAddress(address);

    list.add(s);
    System.out.println("添加成功");
  }


  // 删除学生
  public static void deleteStudent(ArrayList<Student> list) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入要删除的id");
    String id = sc.next();

    // 查询id在集合中的索引
    int index = getIndex(list, id);
    // 对index进行判断，如果大于等于0的，表示存在，直接删除
    // 如果-1，表示不存在 结束方法，回到初始菜单

    if (index >= 0) {
      list.remove(index);
      System.out.println("id为" + id + "学生被删除");
    } else {
      System.out.println("id不存在，删除失败");
    }
  }

  // 修改学生
  public static void updateStudent(ArrayList<Student> list) {

    Scanner sc = new Scanner(System.in);
    System.out.println("请输入要修改的学生id");
    String id = sc.next();
    int indexStu = getIndex(list,id);
    if (indexStu >= 0) {
      Student s = list.get(indexStu);
      // 证明存在 继续录入其他信息
      System.out.println("请输入修改后的学生名字");
      String name = sc.next();
      s.setName(name);

      System.out.println("请输入修改后的学生年龄");
      int age = sc.nextInt();
      s.setAge(age);

      System.out.println("请输入修改后的学生地址");
      String address = sc.next();
      s.setAddress(address);

    }else {
      System.out.println("id不存在");
    }

  }

  // 查询学生
  public static void queryStudent(ArrayList<Student> list) {
    /*
     * 打印所有的学生信息
     *   如果没有，提示：当前无学生信息，请添加后再查询
     *   如果有，需要打印出来 id 姓名 年龄 家庭住址
     * */

    System.out.println("查询学生");

    if (list.isEmpty()) {
      System.out.println("当前无学生信息，请添加后再查询");
      return;
    }

    // 打印表头信息  \t和前面打印的字符相关 补齐8个 或8的倍数
    System.out.println("ID\t姓名\t\t年龄\t家庭住址");
    for (Student student : list) {
      System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
    }

  }

  // 判断 id 是否存在于集合中
  public static boolean contains(ArrayList<Student> list, String id) {
    // 循环遍历集合 得到每一个对象，拿到对象后获取id并进行判断
    return getIndex(list, id) >= 0;
  }

  // 通过id获取索引的方法
  public static int getIndex(ArrayList<Student> list, String id) {
    for (int i = 0; i < list.size(); i++) {
      Student stu = list.get(i);
      String sid = stu.getId();
      if (sid.equals(id)) {
        return i;
      }
    }
    return -1;
  }

}
