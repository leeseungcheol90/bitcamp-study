package com.eomcs;

import java.util.Scanner;

public class App {

  // 한 개의 게시글을 담을 복합 데이터의 변수를 설계

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {

    // App 클래스에서 만든 Scanner 인스턴스를 BoardHandler,MemberHandler 와 같이 쓴다.    
    BoardHandler boardHandler=new BoardHandler("게시판1",keyScan);
    BoardHandler boardHandler2=new BoardHandler("게시판2",keyScan);

    MemberHandler memberHandler=new MemberHandler(keyScan);

    ComputeHandler computeHandler=new ComputeHandler(keyScan);

    menuLoop: while (true) {
      System.out.println("[메뉴]");
      System.out.println("  1: 게시글 관리");
      System.out.println("  2: 게시글2 관리");
      System.out.println("  3: 회원 관리");
      System.out.println("  4: 계산기");
      System.out.print("메뉴를 선택하시오. (종료: quit) [1..3] ");
      String menuNo = keyScan.nextLine();

      switch (menuNo) {
        case "1":
          boardHandler.execute();
          break;
        case "2":
          boardHandler2.execute();
          break;        
        case "3":
          memberHandler.execute();
          break;
        case "4":
          computeHandler.execute();
          break;
        case "quit":
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
      System.out.println();
    }

    keyScan.close();
    System.out.println("안녕히 가세요!");
  }
}
