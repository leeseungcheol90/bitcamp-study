package net.common.bit;

public class Dunkin {

  public String coffee() { // 주문할 때 만듦.==필요할 때 메모리에 로드
    String name="아이스 아메리카노";
    return name;
  }

  public static void donuts(int vol) { // 이미 제품화되어 진열장 전시
    System.out.println("도너츠 메서드 주문 갯수 "+vol+"개입니다.");
  }

  public void menu() {

  }
}
