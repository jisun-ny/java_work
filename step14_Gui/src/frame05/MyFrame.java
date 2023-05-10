package frame05;
// Gui챕터에서는 frame01, 02, 03... 하나 하나가 예제라고 보면 된다.

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//GUI 
// 어떤 창이 뜨는 것을 GUI라고 함

public class MyFrame extends JFrame implements ActionListener{
	
	//생성자
	public MyFrame(String title) {
		//같은 heap 속 부모의 메소드를 호출하는 것이기 때문에 this
		
		//창의 제목은 생성자로 부터 전달받아 부모 생성자로 전달.
		super(title);
		
		//setBounds(x, y, width, height) 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		// MyFrame의 x버튼 (close버튼)을 눌렀을 때 프로세스도 같이 종료 되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JFrame.EXIT_ON_CLOSE = 3
		
		//**여기가 새로운 내용
		
		
		setLayout(new FlowLayout());
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn); //프레임에 버튼 추가하기
		
		Component a = this;
		
		//ActionListener 인터페이스  type의 참조값을 얻어내서
		ActionListener listener1 = new ActionListener() {
			// 이 리스너를 등록한 UI에 어떤 액션이 발생하면 호출되는 메소드
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전송 버튼 눌림");
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다");
				//showMessageDialog(알림 메세지를 어디창에 띄울것인지 frame의 참조값, 띄울 메세지)
				//MyFrame.this --> 클래스명.this하면 바깥에 있는 클래스로 생성한 객체의 참조값을 가리킬 수 있다.				
			}
		};
			
		//인터페이스는 단독 객체생성 불가. 익명의 클래스 사용
		
		//전송버튼에 등록하기	
		sendBtn.addActionListener(listener1);
		
		
		
		JButton deleteBtn = new JButton("삭제");
		add(deleteBtn); //프레임에 버튼 추가하기
		
		//new하면서 즉석에서 바로 전달
//		deleteBtn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("삭제 버튼 눌림");
//				//함수 형태의 메소드에서 this는 바깥 클래스로 생성한 객체의 참조값을 가리킬수 있다.
//				JOptionPane.showConfirmDialog(this, "삭제합니다.");
//			}
//		});

	     //ActionListener 인터페이스 type 의 참조값을 함수 형태로 전달도 가능 
	     deleteBtn.addActionListener((e)->{
	         System.out.println("삭제 버튼을 눌렀네?");
	         //함수 형태의 메소드에서 this 는 바깥 클래스로 생성한 객체의 참조값을 가리킬수 있다.
	         JOptionPane.showMessageDialog(this, "삭제합니다.");
	      });
	      
	      
	     JButton updateBtn=new JButton("수정");
	     add(updateBtn);
	     //MyFrame 을  ActionListener 인터페이스 type 으로 만들수는 없을까? 
	     // MyFrame을 implements ActionListener 해주자
	      updateBtn.addActionListener(this);
		
	
		/*
		 * in javascript
		 * <button id="sendBtn">
		 * <script>
		 * document.querySelector("#sendBtn").addEventListener("click", () => {});
		 */
	
		
		//프레임을 화면상에 실제 보이게하기(false 하면 화면에 보이지 않는다)
		this.setVisible(true);
		
	} 
	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 됩니다.");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "수정합니다");
		
	}
	
}
