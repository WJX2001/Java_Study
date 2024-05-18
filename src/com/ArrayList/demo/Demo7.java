package com.ArrayList.demo;

import java.util.ArrayList;

public class Demo7 {
  public static void main(String[] args) {
    /*
     * main方法中定义一个集合，存入三个用户对象
     * 用户属性: id, username,password
     *
     * 需求：定义一个方法 根据id查找对应的用户信息，如果存在，返回true，如果不存在，返回false
     * */

    ArrayList<User> list = new ArrayList<>();
    User user1 = new User(1, "wjx", "123456");
    User user2 = new User(2, "xjc", "456789");
    User user3 = new User(3, "ccc", "789222");

    list.add(user1);
    list.add(user2);
    list.add(user3);

    String res = getUserDetail(list, 3);
    int res2 = getIndex(list,3);
    System.out.println(res);
    System.out.println(res2);
  }

  public static String getUserDetail(ArrayList<User> list, int id) {
    for (User user : list) {
      if (user.getId() == id) {
        return user.getId() + ", " + user.getUsername() + ", " + user.getPassword();
      }
    }
    System.out.println("啥也没有");
    return null;
  }

  // 如果存在返回索引 如果不存在 返回-1
  public static int getIndex(ArrayList<User> list, int id) {
    for(int i = 0; i < list.size(); i++) {
      if(list.get(i).getId() == id) {
        return i;
      }
    }
    return -1;
  }


}
