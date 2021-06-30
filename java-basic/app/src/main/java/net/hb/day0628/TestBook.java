package net.hb.day0628;

public class TestBook {

  int m=2400;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    char a='A', b='1',c=90;
    System.out.println(a+"\t"+b+"\t"+c);

    int x=a;
    int y=b;
    int z=c;

    System.out.println(x+"\t"+y+"\t"+z);
    System.out.println();
  }

  public void note() {
    int m=1200;
    System.out.println("지역변수 책가격="+m);
    System.out.println("전역변수 책가격="+m);
  }

}
