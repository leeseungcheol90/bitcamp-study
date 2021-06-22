package com.eomcs.lang.ex04;

public class Test04 {
  public static void main(String[] args) {
    int[] a=new int[3];
    a[0]=100;
    a[1]=200;
    a[2]=300;
    // a[3]=400;
    System.out.print(a[0]);
    System.out.print(a[1]);
    System.out.print(a[2]);

    int[] b;
    b=a;
  }
    System.out.print(b[0]);
    System.out.print(b[1]);
    System.out.print(b[2]);
}
