package net.hb.day0628;

import java.util.Date;
import java.util.Scanner;

public class CampTest1 {
  Scanner sc=new Scanner(System.in);
  boolean[] camp = new boolean[5]; // 
  int sel=0, num=0;

  void reserveCamp() {
    checkCamp();

    System.out.print("예약 캠핑 번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); 

    if(num <1 || num >5) {
      System.out.println(num +" 번호를 사용할수 없습니다"); 
      return;
    }

    if (camp[num-1]==true) {
      System.out.println("이미 사용중입니다.");
      return;
    }

    camp[num-1]=true;

    System.out.println("camp["+num+"]"+" 캠핑장 예약성공");
    checkCamp();
  }

  void exitCamp() {
    System.out.print("퇴실할 캠핑장 번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); 

    if (camp[num-1]==false) {
      System.out.println("이미 빈 방입니다.");
      return;
    }
    camp[num-1]=false;

    System.out.println("camp["+num+"]"+" 캠핑장 퇴실성공");
    checkCamp();
  }

  void checkCamp() {
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) 
        System.out.println("  "+ (i+1)+"번째 ■캠핑장 사용중입니다 "  );
      else 
        System.out.println("  "+ (i+1)+"번째 □캠핑장은 비어 있습니다 "  ); 
    } 
  }

  int menu() {
    System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
    return sel = Integer.parseInt(sc.nextLine());
  }

  void myExit() {
    System.exit(1);
  }

  void execute() {
    loop : while(true) {
      try {
        menu();

        switch(sel) {
          case 1: 
            reserveCamp();
            break;
          case 2: 
            exitCamp();
            break;   
          case 3: 
            checkCamp();
            break;
          case 9:
            System.out.println("캠핑장 예약프로그램을 종료합니디");
            myExit();
          default: 
            System.out.println("1~3 메뉴를 선택하셔야 합니다");
            break;   
        }
      } catch (Exception e) {}
    }
  }

  public static void main(String[] args) {
    CampTest1 ct=new CampTest1();
    Date today=new Date();

    System.out.printf("1차원 배열 캠프 예매 %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n",today);

    ct.execute();
    ct.sc.close();
  }
}