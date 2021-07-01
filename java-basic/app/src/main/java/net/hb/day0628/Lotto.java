package net.hb.day0628;

public class Lotto {

  public int[] input() {
    int[] su=new int[6];
    su[0]=9; su[1]=4; su[2]=6;
    su[3]=1; su[4]=3; su[5]=7;  
    return su;
  }

  public int inputHap() {
    int hap=0;
    int[] su=new int[6];
    su[0]=9; su[1]=4; su[2]=6;
    su[3]=1; su[4]=3; su[5]=7;

    for (int i:su)
      hap+=i;

    return hap;
  }

  public void output(int[] a) {
    for (int i:a) {
      System.out.println(i);
    }
    System.out.print(inputHap());
  }

}
