package net.hb.day0628;

import java.util.Scanner;

public class Work02emp {

  Scanner sc=new Scanner(System.in);
  int sabun=2000;
  String name="길동";

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Work02emp work=new Work02emp();
    work.checkInfo();
  }

  void checkInfo() {
    while (true) {
      try {
        System.out.println("사번 입력>>>>(0이면 종료)");
        sabun=Integer.parseInt(sc.nextLine());

        if (sabun==0) 
          return;

        System.out.println("이름 입력>>>>");
        name=sc.nextLine();

        if (checkNum(name) || name.equals("") || name==null) 
          throw new Exception();

      } catch (Exception e) {
        System.out.println("형식을 제대로 입력해주세요.(사번은 숫자, 이름은 문자)");  
        System.out.println();
        continue;
      }

      System.out.println();
      System.out.println("사번 = "+sabun);
      System.out.println("이름 = "+name);
      System.out.println();
    }
  }

  boolean checkNum(String s) {
    boolean check=true;
    int count=0;

    for (int i=0;i<s.length();i++) {
      if ((s.charAt(i))<48 || (s.charAt(i))>58) 
        ++count;
    }

    if (count>=1)
      check=false;

    return check;
  }
}