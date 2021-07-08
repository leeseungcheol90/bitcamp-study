package net.hb.day0707;

import java.sql.*;
import java.util.*;

public class Board {
  Data data=new Data();

  void menu() throws Exception {

    while (true) {
      try {
        System.out.print("\n1. 입력 2. 목록 상세 3. 삭제 4. 종료\n");
        int menu=Integer.parseInt(data.sc.nextLine());

        switch (menu) {
          case 1:
            data.input();
            break;
          case 2:
            data.show();
            break;
          case 3:
            data.delete();
            break;
          case 4:
            System.exit(1);
          default :
            System.out.println("제대로 입력 바람.");
            break;
        }     
      } catch (Exception e) {
        System.out.println("숫자를 입력해주세요.");
        continue;
      }      
    } 
  }

  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    Board board=new Board();
    board.menu();
  }

}

class Data {
  Connection ct=null;
  Statement st=null;
  ResultSet rs=null;

  Scanner sc=new Scanner(System.in);
  final String driver="oracle.jdbc.driver.OracleDriver";
  final String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
  String msg;

  Data() {
    try {
      Class.forName(driver);
      ct=DriverManager.getConnection(url, "system", "1234");
      st=ct.createStatement();
    } catch (Exception e) {}
  }

  void input() throws Exception {
    // code, name, title, 날짜, cnt

    while (true) {
      try {
        System.out.print("code를 입력하세요.>>(0이면 종료)");
        int code=Integer.parseInt(sc.nextLine());

        if (code==0) {
          return;
        }

        System.out.print("이름을 입력하세요.>>");
        String name=sc.nextLine();

        System.out.print("제목을 입력하세요.>>");
        String title=sc.nextLine();

        System.out.print("년도를 입력하세요.>>");
        int year=Integer.parseInt(sc.nextLine());
        System.out.print("날짜(월) 입력하세요.>>");
        int month=Integer.parseInt(sc.nextLine());
        System.out.print("날짜(일) 입력하세요.>>");
        int date=Integer.parseInt(sc.nextLine());

        String cal=year+"-"+month+"-"+date; 
        msg="insert into test (code,name,title,wdate,cnt) "
            + "values("+code+", '"+name+"','"+title+"','"+cal+"',0)";
        System.out.println(msg);

        int ok=st.executeUpdate(msg);

        if (ok > 0) 
          System.out.println("코드 데이터 저장 성공");
        else 
          System.out.println("코드 저장 실패.");
      } catch (Exception e) {
        System.out.println("다시 입력 바랍니다.");
        continue;
      }
    }
  }

  void show() throws Exception {
    try {
      msg="select * from test";

      rs=st.executeQuery(msg);

      System.out.println();
      System.out.print("code\tname\ttitle\twdate\t\t\tcnt\n");

      while (rs.next()) {
        int ucode=rs.getInt("code");
        String uname=rs.getString("name");
        String utitle=rs.getString("title");
        String udate=rs.getString("wdate");
        int ucnt=rs.getInt("cnt");
        System.out.print(ucode+"\t"+uname+"\t"+utitle+"\t"+udate+"\t"+ucnt+"\n");
      }
    } catch (Exception e) {
      return;
    }
  }

  void delete() throws Exception {
    try {
      System.out.print("삭제할 번호를 입력하세요.>>>");
      int num=Integer.parseInt(sc.nextLine());

      System.out.print("정말 삭제하시겠습니까 ?(y/n) ");
      String str=sc.nextLine();

      if (str.equals("n"))
        return;

      msg="delete from test where code="+num;
      System.out.println(msg);
      st.execute(msg);
    } catch (Exception e) {
      return;
    }
  }
}