package frame07;

import java.awt.Component;

/*
 * actioncommand 활용하기
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
   
   //생성자
   public MyFrame(String title) {
      super(title);
      
      // setBounds(x, y, width, height)  창의 위치와 크기 설정
      this.setBounds(100, 100, 500, 500);
      // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new FlowLayout());
      
      //전송 버튼의 참조값을 필드에 저장.
      JButton sendBtn=new JButton("전송"); 
      add(sendBtn);
      
      //JButton sendBtn=new JButton("전송"); 이렇게 하면
	//지역변수가 되어버림
	//this.sendBtn=new JButton("전송"); 
	//this.은 생략가능.
      
      JButton deleteBtn=new JButton("삭제"); 
      add(deleteBtn);
      
      JButton updateBtn=new JButton("수정");
      add(updateBtn);
      
      // 전송, 삭제, 수정 버튼 모두 다 하나의 리스터 등록하기
      //여기서 this는 MyFrame
      // MyFrame은 actionListener type이기도 함
      sendBtn.addActionListener(this);
      deleteBtn.addActionListener(this);
      updateBtn.addActionListener(this);
      
      //각각의 버튼에 action 명령을 설정할 수 있따.
      sendBtn.setActionCommand("send");
      deleteBtn.setActionCommand("delete");
      updateBtn.setActionCommand("update");
      
      
      
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
	//눌려진 버튼의 action command 읽어오기
	  String cmd = e.getActionCommand();
	  /*
	   * java에서 문자열의 참조값이 같은지 비교할 때는 비교연산자 == 를 이용해서 비교하면 되지만
	   * 
	   * 문자열의 참조값이 아닌 내용이 같은지 비교할때는 String의 .equals() 메소드를 이용해서 비교해야한다.
	   * 
	   * 왜냐하면 java에서는 문자열을 만드는 방법에 따라서 내용은 같지만 참조값이 다르게 나오는경우도 있기 때문이다.
	   * 따라서 문자열의 내용이 같은지 정확히 비교할 때는 반드시 .equals() 메소드를 이용해야한다
	   * (이걸 까먹으면 밤 샐수도 있음...)
	   */
	  
	  /*
	   * in javascript 
	   * "kim" == "kim"
	   * 
	   * in java
	   * "kim" == "kim" 이건 될 때도 있고 안될 때도 있다!
	   * .equals() 메소드를 이용
	   */
	  
	  //cmd == "send" 이렇게 xxx
	  if(cmd.equals("send")) {
		  JOptionPane.showMessageDialog(this, "전송합니다");
	  }else if(cmd.equals("delete")) {
		  JOptionPane.showMessageDialog(this, "삭제합니다");
	  }else if(cmd.equals("update")) {
		  JOptionPane.showMessageDialog(this, "수정합니다");
	  }
      
   }
}




