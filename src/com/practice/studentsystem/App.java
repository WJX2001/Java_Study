package com.practice.studentsystem;

import java.util.ArrayList;
import java.util.Random;
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
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入用户名");
    String username = sc.next();
    boolean flag = contains(list, username);

    if (!flag) {
      System.out.println("当前用户" + username + "未注册，请先注册");
      return;
    }

    // 键盘录入身份证号码和手机号码
    System.out.println("请输入身份证号码");
    String personId = sc.next();
    System.out.println("请输入手机号码");
    String phoneNumber = sc.next();

    // 比较用户对象中的手机号码和身份证号码是否相同
    // 需要把用户对象先获取出来
    int index = findIndex(list, username);

    User user = list.get(index);
    if (!(user.getPersonId().equalsIgnoreCase(personId) && user.getPhoneNumber().equalsIgnoreCase(phoneNumber))) {
      System.out.println("身份证号码或者手机号码输入有误，不能修改密码");
      return;
    }
    String password;
    while (true) {
      System.out.println("请输入新的密码");
      // 进行修改
      password = sc.next();
      System.out.println("请再次输入新的密码");
      String passwordAgain = sc.next();

      if (password.equals(passwordAgain)) {
        System.out.println("两次密码输入一致");
        break;
      } else {
        System.out.println("两次密码输入不一致，需要重新输入");

      }
    }
    // 直接修改
    user.setPassword(password);
    System.out.println("密码修改成功");
  }

  private static int findIndex(ArrayList<User> list, String username) {
    /*
     * TODO:
     *   1. 判断当前用户的身份证号码和手机号码是否一致，
     *   2. 如果一致，则提示输入密码，进行修改，
     *   3. 如果不一致，则提示：帐号信息不匹配，修改失败
     * */

    for (int i = 0; i < list.size(); i++) {
      User user = list.get(i);
      if (user.getUsername().equals(username)) {
        return i;
      }

    }
    return -1;
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

    System.out.println("注册成功");

    // 遍历集合
    printList(list);
  }

  private static void printList(ArrayList<User> list) {
    for (User user : list) {
      System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getPersonId() + ", " + user.getPhoneNumber());
    }
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
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.println("请输入用户名");
      String username = sc.next();

      // 判断用户名是否存在
      boolean flag = contains(list, username);
      if (!flag) {
        System.out.println("用户名" + username + "未注册，请先注册再登陆");
        return;
      }

      System.out.println("请输入密码");
      String password = sc.next();

      while (true) {
        String rightCode = getCode();
        System.out.println("当前正确的验证码为：" + rightCode);
        System.out.println("请输入验证码");
        String code = sc.next();
        if (code.equalsIgnoreCase(rightCode)) {
          System.out.println("验证码正确");
          break;
        } else {
          System.out.println("验证码错误");
        }
      }
      User userInfo = new User(username, password, null, null);
      // 验证 用户名和密码是否正确
      boolean result = checkUserInfo(userInfo, list);

      if (result) {
        System.out.println("登陆成功，可以使用学生管理系统了");
        // 创建对象调用方法，启动学生管理系统
        StudentSystem stu = new StudentSystem();
        stu.startStudentSystem();
        break;
      } else {
        System.out.println("登陆失败，用户名或者密码错误");
        if (i == 2) {
          System.out.println("当前帐号" + username + "被锁定");
          // 直接结束方法
          return;
        } else {
          System.out.println("用户名或者密码错误，还剩下" + (2 - i) + "次机会");
        }
      }
    }

  }

  private static boolean checkUserInfo(User userInfo, ArrayList<User> list) {
    // 遍历集合 判断用户是否存在
    for (User u : list) {
      if (u.getUsername().equals(userInfo.getUsername()) && u.getPassword().equals(userInfo.getPassword())) {
        return true;
      }
    }
    return false;
  }

  // 生成一个验证码
  private static String getCode() {
    // 1.创建一个集合添加所有的大写和小写字母
    ArrayList<Character> list = new ArrayList<>();
    for (int i = 0; i < 26; i++) {
      list.add((char) ('a' + i));
      list.add((char) ('A' + i));
    }

    StringBuilder sb = new StringBuilder();
    // 2.随机抽取4个字符
    Random r = new Random();
    for (int i = 0; i < 4; i++) {
      // 获取随机索引
      int index = r.nextInt(list.size());

      // 利用随机索引获取随机字符
      char c = list.get(index);
      sb.append(c);
    }
    System.out.println(sb);

    // 3.把一个随机数字添加到末尾
    int randomNum = r.nextInt(10);
    sb.append(randomNum);

    // 4.将数字出现在任意位置
    // 先把字符串变成字符数组 然后变成一个字符串

    char[] arr = sb.toString().toCharArray();
    // 拿着最后一个索引和随机索引进行交换
    int randomNumArr = r.nextInt(arr.length);
    char tmp = arr[arr.length - 1];
    arr[arr.length - 1] = arr[randomNumArr];
    arr[randomNumArr] = tmp;

    return new String(arr);
  }
}
