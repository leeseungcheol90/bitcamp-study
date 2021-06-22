package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Test0110 {
  static void printSpaces(int len) {
    for (int i=0;i<len;i++)  
      System.out.print(" ");    
  }

  static void printStars(int len) {
    for (int i=0;i<len;i++) 
      System.out.print("*");
  }

  static int getSpaceLength(int a,int b) {
    return (a-b)/2;
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len= keyScan.nextInt();

    for (int start=1;start<len;start+=2) { 
      printSpaces(getSpaceLength(len,start));
      printStars(start);
      System.out.println();
    }
  }
}