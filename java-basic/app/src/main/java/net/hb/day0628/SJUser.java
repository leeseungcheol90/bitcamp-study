package net.hb.day0628;

public class SJUser {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SJ sj=new SJ();
    int math=100;
    int eng=55;
    int hap=sj.getTotal("kim",math,eng);
    double avg=sj.getMean(hap);
    char grade=sj.getGrade(avg);
    String result=sj.getResult(avg,math,eng);

    System.out.println(avg);
    System.out.println(grade);
    System.out.println(result);
  }

}
