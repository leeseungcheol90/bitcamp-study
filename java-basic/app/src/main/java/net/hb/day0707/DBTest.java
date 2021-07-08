package net.hb.day0707;

import java.sql.*;
import java.util.*;

public class DBTest {

  void menu() {
    System.out.println();
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    DB db=new DB();

    try {
      db.input();
      db.executeInsert();
      db.executeSelect();
    } catch (Exception e) {
      System.out.println("에러 이유 : "+e);
    }
  }
}

class DB {
  Connection cn=null; // DB 서버 연결 정보 서버ip주소 계정id, pwd 등..
  Statement st=null; // st=cn.createStatement() 명령어 생성 삭제, 신규등록 조회
  ResultSet rs=null; // select 조회 결과를 기억
  Scanner sc=new Scanner(System.in);

  String msg;
  int code;

  void executeInsert() throws Exception {

    Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 드라이브 로드 
    String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";      
    cn=DriverManager.getConnection(url,"system","1234");
    st=cn.createStatement();

    int ok=st.executeUpdate(msg);

    if (ok > 0) 
      System.out.println("코드 데이터 저장 성공");
    else 
      System.out.println("코드 저장 실패.");
    Thread.sleep(3000);

  }

  void executeSelect() throws Exception {
    msg="select * from test";

    rs=st.executeQuery(msg);

    System.out.println();
    System.out.println("코드\t이름\t제목\t날짜\t\t\t조회수");

    while (rs.next()==true) {
      int ucode=rs.getInt("code");
      String uname=rs.getString("name");
      String utitle=rs.getString("title");
      String udate=rs.getString("wdate");
      int ucount=rs.getInt("cnt");
      System.out.println(ucode+"\t"+uname+"\t"+utitle+"\t"+udate+"\t"+ucount);
    }
  }

  void input() {
    System.out.print("\ncode 입력(4자리수)>>>");
    int code=Integer.parseInt(sc.nextLine());

    System.out.print("이름 입력>>>");
    String name=sc.nextLine();

    System.out.print("제목 입력>>>");
    String title=sc.nextLine();

    System.out.print("년도 입력>>>");
    int year=Integer.parseInt(sc.nextLine());

    System.out.print("월 입력>>>");
    int month=Integer.parseInt(sc.nextLine());

    System.out.print("일 입력>>>");
    int date=Integer.parseInt(sc.nextLine());

    String cal="'"+year+"-"+month+"-"+date+"'";

    msg="insert into test (code,name,title,wdate,cnt) "
        + "values("+code+", '"+name+"', '"+title+"', "+cal+",0)";

    System.out.println(msg);
  }
}