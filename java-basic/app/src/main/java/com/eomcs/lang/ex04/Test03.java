package com.eomcs.lang.ex04;

public class Test03 {
  public static void main(String[] args) {
    int[] z=new int[5];

    for (int i=1;i<=5;i++) {
      z[i-1]=i*100;
      System.out.println(z[i-1]);
    }
  }
}
