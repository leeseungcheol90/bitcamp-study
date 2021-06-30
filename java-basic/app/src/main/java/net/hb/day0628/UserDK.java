package net.hb.day0628;

import java.util.Date;
import net.common.bit.Dunkin;

public class UserDK {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Date today=new Date();

    System.out.printf("오늘의 날짜는 ");

    Dunkin dk=new Dunkin();
    String msg=dk.coffee();
    System.out.println(msg);

    Dunkin.donuts(5);
  }

}
