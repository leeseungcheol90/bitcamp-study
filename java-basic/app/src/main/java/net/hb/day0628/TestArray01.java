package net.hb.day0628;

public class TestArray01 {
  static int length=5;

  public static void main(String[] args) {
    String[] dong=new String[length];

    for (int i=0;i<dong.length;i++) {
      System.out.println(dong[i]+' ');
    }
    System.out.println();

    boolean[] camp = new boolean[5];

    for (int i=0;i<camp.length;i++) {
      System.out.println(camp[i]+" ");
    }

    System.out.println();

    double[] pi = new double[5];

    for (int i=0;i<pi.length;i++) {
      System.out.println(pi[i]+" ");      
    }

    System.out.println();
  }

}
