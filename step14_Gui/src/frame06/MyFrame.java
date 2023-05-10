package frame06;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	//필드
	//보통 메소드에서 필요한 값들을 가지고 있음
	//필드 선언할때 같은 타입인 경우 ,사용해서 한줄로 선언 가능
	
	JButton sendBtn, deleteBtn, updateBtn;
	
	//	JButton sendBtn;
	//	JButton deleteBtn;
	//	JButton updateBtn;
   
   //생성자
   public MyFrame(String title) {
      super(title);
      
      // setBounds(x, y, width, height)  창의 위치와 크기 설정
      this.setBounds(100, 100, 500, 500);
      // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new FlowLayout());
      
      //전송 버튼의 참조값을 필드에 저장.
      this.sendBtn=new JButton("전송"); 
      add(sendBtn);
      
      //JButton sendBtn=new JButton("전송"); 이렇게 하면
	//지역변수가 되어버림
	//this.sendBtn=new JButton("전송"); 
	//this.은 생략가능.
      
      this.deleteBtn=new JButton("삭제"); 
      add(deleteBtn);
      
      this.updateBtn=new JButton("수정");
      add(updateBtn);
      
      // 전송, 삭제, 수정 버튼 모두 다 하나의 리스터 등록하기
      //여기서 this는 MyFrame
      // MyFrame은 actionListener type이기도 함
      sendBtn.addActionListener(this);
      deleteBtn.addActionListener(this);
      updateBtn.addActionListener(this);
      
      
      // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
      setVisible(true);
   }
   
   public static void main(String[] args) {
      //MyFrame 객체 생성
      new MyFrame("나의 프레임");
      System.out.println("main 메소드가 종료 됩니다.");
   }

   @Override
   public void actionPerformed(ActionEvent e) {
	   //메소드의 매개변수로 전달되는 ActionEvent 객체에 이벤트에 대한 정보가 들어있다.
	   //이 객체를 활용하면 어떤 버튼이 눌러 졌는지 구별할 수 있따.
	   
	   System.out.println("어떤 버튼을 눌렀는지 어떻게 알지?");
	   //눌러진 버튼의 참조값 얻어오기
	   Object which = e.getSource();
	// 메소드 안에서 생성자에서 선언된 지역변수를 참조할 수 있을까? nooooooo
	   // 생성자에서 사용했던 값을 메소드 안에서 사용하고싶다면?? 자바는 전역변수의 개념이 없기 때문에 .. MyFrame 객체 안에서 어디서든 쓸 수 있는 것들은 field에 담아두자
	   if(which == sendBtn) { 
		   //전송버튼을 누른 것이다
		   JOptionPane.showMessageDialog(this, "전송합니다");
	   }else if (which == deleteBtn) {
		   JOptionPane.showMessageDialog(this, "삭제합니다");
	   }else if (which == updateBtn) {
		   JOptionPane.showMessageDialog(this, "수정합니다");
	   }
	   
      
   }
}




