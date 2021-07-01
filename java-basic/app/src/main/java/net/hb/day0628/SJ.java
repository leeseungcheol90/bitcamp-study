package net.hb.day0628;

public class SJ {
  int getTotal(String s,int a,int b) {
    int total=0;
    total=a+b;
    System.out.println(s+"님의 합산 점수는요 "+total+"점입니다.");

    return total;
  }

  double getMean(int i) {
    double mean=i/2.0;

    return mean;
  }

  char getGrade(double a) {
    char grade;

    switch((int)a/10) {
      case 9:
        grade='A';
        break;
      case 8:
        grade='B';
        break;
      case 7:
        grade='C';
        break;
      case 6:
        grade='D';
        break;
      default:
        grade='E';
        break;
    }
    return grade;
  }

  String getResult(double value, int a, int b) {
    String result;

    if (value>=70.0 && a>=60 && b>=60) 
      result="축!!합격";
    else 
      result="재시험!!";

    return result;
  }

}
