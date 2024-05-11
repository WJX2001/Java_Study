package com.wjx.test2;

import java.util.Random;

public class Role {
  private String name;
  private int blood;
  private char gender;
  private String face;



  public Role(String name, int blood) {
    this.name = name;
    this.blood = blood;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBlood() {
    return blood;
  }

  public void setBlood(int blood) {
    this.blood = blood;
  }

  // 定义一个方法用于攻击别人
  // r1 攻击 r2
  // 方法的调用者去攻击参数

  public void attack(Role role) {
    // 计算造成的伤害 1~20
    Random r = new Random();
    int hurt = r.nextInt(20) + 1;

    // 剩余血量
    int remainBlood = role.getBlood() - hurt;
    // 对剩余血量做一个验证 如果为负数，就修改为0
    remainBlood = Math.max(remainBlood, 0);

    // 修改一下敌人的血量
    role.setBlood(remainBlood);


    // this 表示方法的调用者
    System.out.println(this.getName() + "举起拳头打了" +
      role.getName() + "一下，" + "造成了" + hurt +
      "点伤害" + role.getName() + "还剩下多少" + remainBlood + "点血");
  }
}
