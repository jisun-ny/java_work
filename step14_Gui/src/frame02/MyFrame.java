package frame02;
// Gui챕터에서는 frame01, 02, 03... 하나 하나가 예제라고 보면 된다.

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//GUI 
// 어떤 창이 뜨는 것을 GUI라고 함

public class MyFrame extends JFrame{
	
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
		
		//FlowLayout 매니저 사용해보기
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn1 = new JButton("버튼1");
		add(btn1); //프레임에 버튼 추가하기
		JButton btn2 = new JButton("버튼2");
		add(btn2); //프레임에 버튼 추가하기
		JButton btn3 = new JButton("버튼3");
		add(btn3); //프레임에 버튼 추가하기
		
		//프레임을 화면상에 실제 보이게하기(false 하면 화면에 보이지 않는다)
		this.setVisible(true);
		
	} 
	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료 됩니다.");

	}
	
}
