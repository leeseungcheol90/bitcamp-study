package net.hb.day0628;

import java.util.Scanner;

public class TestGugudan {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int dan=1;
    System.out.print("원하는 답 입력>>>");

    try {
      dan=Integer.parseInt(sc.nextLine());
    } catch (Exception e) {}
    finally {
      try {
        for (int i=1;i<10;i++) {
          System.out.println(dan+"*"+i+"="+(dan*i));

          Thread.sleep(1000);
        }
      } catch (Exception ex) {}
      System.out.println();
      System.out.println("우리나라");
      System.out.println("대한민국");
      System.out.println("금수강산");
    }
  }

}
