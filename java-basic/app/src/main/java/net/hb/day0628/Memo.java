package net.hb.day0628;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Memo extends Frame implements WindowListener,ActionListener {
  private Button btnExit=new Button("Quit");
  private Button btnSend=new Button("Report");
  private TextField tf=new TextField(30); // 한줄 입력
  private TextArea ta=new TextArea(); // 가로, 세로
  private Font font=new Font("Consolas",Font.BOLD,20);
  private Panel pan=new Panel(); // 레이아웃 받침대 = 쟁반 역할

  public Memo() {
    // 초간단 메모장
    pan.add(tf); pan.add(btnSend); pan.add(btnExit);
    ta.setFont(font);
    this.add("Center",ta);
    this.add("South",pan); //pan=Panel판넬
    this.setSize(400,350);
    this.setVisible(true);
    this.setTitle("초간단 메모장");

    // 이벤트 연결 리스너 추가
    addWindowListener(this);
    tf.addActionListener(this);
    btnSend.addActionListener(this);
    btnExit.addActionListener(this);

    ta.setBackground(Color.YELLOW);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Memo pad=new Memo();
  }

  @Override
  public void windowClosing(WindowEvent e) {
    // TODO Auto-generated method stub
    myExit();
  }

  @Override public void windowClosed(WindowEvent e) {}
  @Override public void windowIconified(WindowEvent e) {}
  @Override public void windowDeiconified(WindowEvent e) {}
  @Override public void windowActivated(WindowEvent e) {}
  @Override public void windowDeactivated(WindowEvent e) {}
  @Override public void windowOpened(WindowEvent e) {}

  @Override
  public void actionPerformed(ActionEvent ae) {
    // 이 메서드는 버튼 클릭, 이미지 클릭, 입력란 인터 등을 했을 때의
    // 동작을 처리하는 메서드임.
    if (ae.getSource()==tf) {
      myText();
    } else if (ae.getSource()==btnSend) {
      myText();
    } else if (ae.getSource()==btnExit) {
      myExit();
    } else {

    }
  }

  public void myText() {
    // 첫번째 tf입력란 데이터 가져오기
    // 두번째 tf 내용을 ta 추가후 tf 내용 삭제하고 tf 입력란에 초점을 맞춤.
    String data=tf.getText();
    ta.append(data+"\n");
    tf.setText("");
    tf.requestFocus();
  }

  public void myExit() {
    System.out.println("초간단 메모장 프로그램을 종료합니다.");
    System.exit(1);
  }

}
