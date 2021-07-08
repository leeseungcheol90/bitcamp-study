package net.hb.day07;

import java.util.*;
import java.io.*;

public class Test {

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    try (FileWriter fis=new FileWriter("c:\\Mtest\\test.sql",true)) {
      Scanner sc=new Scanner(System.in);
      String msg="";

      while(true) {
        System.out.println("사번 입력>>>");
        int a=Integer.parseInt(sc.nextLine());

        if (a==0)
          System.exit(1);

        System.out.println("이름 입력>>>");
        String b=sc.nextLine();
        System.out.println("부서 입력>>>");
        String c=sc.nextLine();

        msg="insert into insa(sabun,name,buse) values("+a+",'"+b+"','"+c+"')";
        System.out.println(msg);

        fis.append(msg);
      }
    } catch (IOException e) {};
  }

}
