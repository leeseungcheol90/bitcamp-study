package net.hb.day0628;

import java.util.Scanner;

public class Work01jumin {

  static Scanner sc=new Scanner(System.in);
  static String gender=null;
  static String juminNum1;
  static String juminNum2;
  static  int pos1;
  static  int pos2;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    yourInfo();
  }

  static void yourInfo() {
    while (true) {
      System.out.print("주민등록번호를 입력하세요.>>>");    
      String juminNum=sc.nextLine();

      if (juminNum.equals("q")) 
        return;  
      else if (juminNum.length()!=14) {
        System.out.println("111222-3334444 형태로 입력 바람.");
        System.out.println();
        continue;
      }

      pos1=juminNum.indexOf('-')-1;
      pos2=juminNum.indexOf('-')+1;

      gender=(juminNum.charAt(pos2)=='1' || juminNum.charAt(pos2)=='3') ? "남자" : "여자";
      juminNum1=juminNum.substring(0,pos1+1);
      juminNum2=juminNum.substring(pos2);

      System.out.println("******-"+juminNum2);
      System.out.println("당신의 성별은 "+gender+"입니다.");
      System.out.println();
    }
  }

}
