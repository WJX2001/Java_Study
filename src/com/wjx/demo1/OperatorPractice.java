package com.wjx.demo1;

public class OperatorPractice {
  public static void main(String[] args) {

    // 如果有小数参与计算，结果有可能不精确的
    // 整数参与计算，结果只能得到整数

    // TODO: 键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台

    // 1.键盘录入
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("输入一个三位数字");
//    int number = scanner.nextInt();
//
//    // 2.获取个位、十位、百位
//    // 个数： 数字 % 10
//    // 十位： 数字 / 10 % 10
//    // 百位： 数字 / 10 /10 % 10
//
//    int onesDigits = number % 10;
//    int twoDigits = number / 10 % 10;
//    int threeDigits = number / 100 % 10;
//
//    System.out.println("个位：" + onesDigits);
//    System.out.println("十位：" + twoDigits);
//    System.out.println("百位：" + threeDigits);


    /*
     *  TODO: 约会案例
     *   键盘录入两个整数，表示 你和你约会对象衣服的时髦度（手动录入0-10，不能录入其他）
     *   如果你的时髦程度大于你对象的时髦程度，相亲就成功，true,否则为false
     * */
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("请输入两个数字：0-10");
//    String input = scanner.nextLine();
//    String[] parts = input.trim().split("\\s+");
//    int firstNum = Integer.parseInt(parts[0]);
//    int secondNum = Integer.parseInt(parts[1]);
//
//    boolean flag = firstNum > secondNum;
//    System.out.println("成功了吗:" + flag);

    // TODO: 键盘录入两个整数，如果其中一个为6，最终输出结果为true 如果和为6的倍数，输出true,其他情况都是false

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("请输入第一个数字");
//    int firstNum = scanner.nextInt();
//    System.out.println("请输入第二个数字");
//    int secondNum = scanner.nextInt();
//    boolean flag = firstNum == 6 || secondNum == 6 || (firstNum + secondNum) % 6 == 0;
//    System.out.println(flag);

    /*
     * TODO: 键盘录入星期数，显示今天的减肥活动
     * */
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("请输入一个数字");
//    String sportType = scanner.nextLine();
//    switch (sportType) {
//      case "1":
//        System.out.println("跑步");
//        break;
//      case "2":
//        System.out.println("游泳");
//        break;
//      case "3":
//        System.out.println("慢走");
//        break;
//      case "4":
//        System.out.println("动感单车");
//        break;
//      case "5":
//        System.out.println("拳击");
//        break;
//      case "6":
//        System.out.println("爬山");
//        break;
//      case "7":
//        System.out.println("好好吃一顿");
//        break;
//      default:
//        System.out.println("咩有");
//        break;
//    }
//    // switch 另一种写法 省略 break
//    int number = scanner.nextInt();
//    switch (number) {
//      case 1 -> {
//        System.out.println('一');
//      }
//      case 2 -> {
//        System.out.println('二');
//      }
//    }

    /*
     * TODO: 用户选择
     *   1.机票查询 2.机票预定 3.机票改签 4.退出服务
     * */
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("预定用户选择");
//    int str = scanner.nextInt();
//
//    switch (str) {
//      case 1 -> {
//        System.out.println("");
//      }
//    }

//    double height = 8844430;
//    double paper = 0.1;
//
//    int count = 0;
//
//    while (paper < height) {
//      paper *= 2;
//      count++;
//    }
//    System.out.println(count);

  }

//  public boolean isPalindrome(int x) {
////    String tmpStr = String.valueOf(x);
////    int len = tmpStr.length();
////
////    int left = 0;
////    int right = len - 1;
////    while (left <right) {
////      if (tmpStr.charAt(left) != tmpStr.charAt(right)) {
////        return false;
////      }
////      left++;
////      right--;
////    }
////    return true;
//  }

}
