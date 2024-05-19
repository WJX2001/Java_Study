package com.practice.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    ArrayList<User> list = new ArrayList<>();
    while (true) {
      System.out.println("欢迎来到学生管理系统");
      System.out.println("请选择操作：1登陆 2注册 3忘记密码");
      Scanner sc = new Scanner(System.in);

      String choose = sc.next();
      switch (choose) {
        case "1" -> login(list);
        case "2" -> register(list);
        case "3" -> forgetPassword(list);
        case "4" -> {
          System.out.println("谢谢使用，再见");
          System.exit(0);
        }
        default -> System.out.println("没有这个选项");
      }
    }
  }

  private static void forgetPassword(ArrayList<User> list) {
    System.out.println("忘记密码");
  }

  private static void register(ArrayList<User> list) {
    String username;
    String password;
    String personId;
    String phoneNumber;
    // 用户名，密码，身份证号码，手机号码放到用户对象中
    // 把用户对象添加到集合中
    Scanner sc = new Scanner(System.in);

    // TODO: 1.键盘录入用户名
    while (true) {
      System.out.println("请输入用户名");
      // 录入用户名
      username = sc.next();

      /*
       * TODO:
       *     1.用户名唯一
       *     2.用户名长度必须在3-15之间
       *     3.只能是字母加数字的组合，但是不能是纯数字
       * */

      // 先验证格式是否正确，再验证是否唯一
      boolean flag1 = checkUsername(username);
      if (!flag1) {
        System.out.println("用户名不满足条件，需要重新输入");
        continue;
      }

      // 校验用户名唯一
      boolean flag2 = contains(list, username);
      if (flag2) {
        // 用户名已存在,当前用户名无法注册，需要重新输入
        System.out.println("用户名" + username + "已存在，请重新输入");
      } else {
        // 不存在 表示当前用户名可用，可以继续录入下面的其他数据
        System.out.println("用户名" + username + "可用");
        break;
      }
    }

    // TODO: 2.键盘录入密码
    // 密码键盘输入两次，两次一致才可以进行注册
    while (true) {
      System.out.println("请输入要注册的密码");
      password = sc.next();
      System.out.println("请再次输入要注册的密码");
      String againPassword = sc.next();
      if (!password.equals(againPassword)) {
        System.out.println("两次密码输入不一致，请重新输入");
      } else {
        System.out.println("两次密码一致，请继续录入其他数据");
        break;
      }
    }


    // TODO: 3.键盘录入身份证号码
    while (true) {
      System.out.println("请输入身份证号码");
      personId = sc.next();

      boolean flag = checkPersonId(personId);
      if (flag) {
        System.out.println("身份证号码满足要求");
        break;
      } else {
        System.out.println("身份证号码格式有误，请重新输入");
      }
    }

    // TODO: 4.键盘录入手机号码
    while (true) {
      System.out.println("请输入手机号码");
      phoneNumber = sc.next();
      boolean flag = checkPhoneNum(phoneNumber);
      if (flag) {
        System.out.println("手机号满足要求");
        break;
      } else {
        System.out.println("手机号格式有误，请重新输入");
      }
    }

    User u = new User(username, password, personId, phoneNumber);
    list.add(u);
  }

  private static boolean checkPhoneNum(String phoneNumber) {
    /*
     * TODO:
     *   1. 长度为11位
     *   2. 不能以0开头
     *   3. 必须是数字
     * */
    if (phoneNumber.length() != 11) {
      return false;
    } else if (phoneNumber.startsWith("0")) {
      return false;
    }

    for (int i = 0; i < phoneNumber.length(); i++) {
      char c = phoneNumber.charAt(i);
      if (!(c >= '0' && c <= '9')) {
        return false;
      }
    }
    return true;
  }

  private static boolean checkPersonId(String personId) {
    /*
     * TODO:
     *     1. 长度为18位
     *     2. 前17位必须是数字，最后一位可以是数字，也可以是大写X或者小写x
     *     3. 不能以0开头
     * */
    if (personId.length() != 18) {
      return false;
    }

    // 不能以0开头
    boolean flag = personId.startsWith("0");
    if (flag) {
      return false;
    }

    // 前17位必须都是数字
    for (int i = 0; i < personId.length() - 1; i++) {
      char c = personId.charAt(i);

      if (!(c >= '0' && c <= '9')) {
        return false;
      }
    }
    char end = personId.charAt(personId.length() - 1);
    return (end >= '0' && end <= '9') || (end == 'x') || (end == 'X');
  }

  private static boolean contains(ArrayList<User> list, String username) {
    // 循环遍历集合，得到每一个用户对象
    for (User u : list) {
      if (u.getUsername().equals(username)) {
        return true;
      }
    }
    return false;
  }

  private static boolean checkUsername(String username) {
    /*
     * 2.用户名长度必须在3-15之间
     * 3.只能是字母加数字的组合，但是不能是纯数字
     * */
    int len = username.length();
    // 记录字母出现的个数
    int count = 0;
    if (len < 3 || len > 15) {
      return false;
    }

    // 对组合进行校验 循环得到每一个字符，如果有一个字符不是字母或者数字 返回false
    for (int i = 0; i < username.length(); i++) {
      char c = username.charAt(i);

      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
        count++;
      }
      if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
        return false;
      }
    }


    return count > 0;

  }

  private static void login(ArrayList<User> list) {
    System.out.println("登陆");

  }

}
