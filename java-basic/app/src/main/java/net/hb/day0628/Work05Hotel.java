package net.hb.day0628;

import java.util.Scanner;

public class Work05Hotel {

  private int floor; // 층=행 3층
  private int room; // 호=열 5호
  private String[][] name=new String[3][5];
  private String title;
  private String guestName;
  Scanner sc=new Scanner(System.in);

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Work05Hotel wh=new Work05Hotel("남산하얏트");
    wh.process();
  }

  void process() {
    int sel=9;

    for (int i=0;i<name.length;i++) {
      for (int j=0;j<name[i].length;j++) {
        name[i][j]="";
      }
    }

    while(true) {
      System.out.print("\n1.투숙 2.퇴실 3.map 4.list 9. 종료");
      System.out.println();
      try {
        sel=Integer.parseInt(sc.nextLine());

        if (sel==9) {
          System.out.println("호텔 예약 프로그램 종료.");
          System.exit(1);
        }

        switch(sel) {
          case 1: checkIn(); break;
          case 2: checkOut(); break;
          case 3: map(); break;
          case 4: list(); break;
          default:
            System.out.println("잘못 누르셨습니다.");
            continue;
        }
      } catch (Exception e) {
        System.out.println("숫자를 입력해주세요.");
        continue;
      }
    }
  }

  void checkIn() {
    try {
      System.out.println("몇 층에 투숙할래요?>>>");
      floor=Integer.parseInt(sc.nextLine());

      System.out.println("몇 호에 투숙할래요?>>>");
      room=Integer.parseInt(sc.nextLine());

      System.out.println("이름이 무엇입니까?>>>");
      guestName=sc.nextLine();

      if (name[floor-1][room-1]!="") {
        System.out.println("예약이 꽉 찼습니다.");
        return;
      }

      name[floor-1][room-1]=guestName;

    } catch (Exception e) {
      System.out.println("잘못 누르셨습니다.");
      return;
    }

    System.out.println("title"+"님 예약이 성공적으로 이루어졌습니다.");    
  }

  void checkOut() {
    try {
      System.out.println("몇 층에 퇴실할래요?>>>");
      floor=Integer.parseInt(sc.nextLine());

      System.out.println("몇 호에 퇴실할래요?>>>");
      room=Integer.parseInt(sc.nextLine());

      if (name[floor-1][room-1]=="") {
        System.out.println("이미 퇴실하셨습니다.");
        return;
      }

      name[floor-1][room-1]="";

    } catch (Exception e) {
      System.out.println("잘못 누르셨습니다.");
      return;
    }

    System.out.println("퇴실이 성공적으로 이루어졌습니다.");
  }

  void map() { //printAll=
    System.out.println("                        [호텔 : "+title+"]");
    System.out.println("======================================================================");

    for (int i=0;i<name.length;i++) { //i는 0~2까지.
      for (int j=0;j<name[i].length;j++) { //j는 0~4까지.
        System.out.print((i+1)+"0"+(j+1)+"호\t\t");
        if (j==4) {
          System.out.println();
          for (int k=0;k<name[i].length;k++) {
            System.out.print(name[i][k].toString()+"\t");          
          }
          System.out.println();
        }
      }
    }
  }

  void list() {
    String nemo="";
    for (int i=0;i<name.length;i++) { //i는 0~2까지.
      for (int j=0;j<name[i].length;j++) { //j는 0~4까지.
        String guestName=name[i][j];
        nemo=(guestName!="") ? "■" : "□";        
        if (guestName!="") System.out.print((i+1)+"0"+(j+1)+"호"+nemo+guestName+"\t\t");        
        else System.out.print((i+1)+"0"+(j+1)+"호"+nemo+guestName+"\t\t\t\t");
      }
      System.out.println();
    }    
  }

  Work05Hotel() {

  }

  Work05Hotel(String title) {
    this.title=title;
  }

  Work05Hotel(String name, int year) {

  }

}
