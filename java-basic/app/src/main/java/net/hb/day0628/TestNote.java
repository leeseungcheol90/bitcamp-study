package net.hb.day0628;

public class TestNote {

  String book() {
    String my="몽블랑";
    return my;
  }

  void note() {
    System.out.println("책 제목="+book());
  }

  int price() {
    int money=2700;
    return money;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("김영임 9:42 ");
    System.out.println("까사노 9:42 ");

    TestNote tn=new TestNote();
    tn.note();
    System.out.println(tn.price());
  }

}
