package frame01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/*
 * 일괄 import하는 방법
 * ctrl + shift + o
 */

public class MyFrame extends JFrame implements ActionListener{
	 //생성자
	   public MyFrame(String title) {
	      super(title);
	      //프레임의 초기 설정 작업하기 
	      setBounds(100, 100, 500, 500);
	      // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      //레이아웃 설정
	      setLayout(new FlowLayout());
	      
	      JButton startBtn=new JButton("작업 시작");
	      startBtn.addActionListener(this);
	      // this는 MyFrame이기 때문에 밑에 있는 actionPerformed가 실행
	      //프레임에 버튼 추가
	      add(startBtn);
	      
	      JTextField tf=new JTextField(10);
	      //프레임에 JTextField 추가
	      add(tf);
	      
	      // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
	      setVisible(true);
	   }

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("작업을 시작합니다.");
		// 10초가 걸리는 작업이라고 가정하자
		// 10초 동안 다른 것을 아무것도 할 수 없음.
		// 여기서는 버튼으 누르면 이 메소드가 실행되므로 버튼을 누르면 10초동안 다른거 못함
		/* 
		 * Run을 누르면 main 메소드에서 시작되는 작업단위가 있는데
		 * 그 작업 단위를 main thread 메인 스레드 라고 부른다.
		 * 특별히 작업 단위를 늘리지 않은 이상 하나의 작업단위만 존재한다.
		 * (작업 단위를 늘리는 것을 multi threading 이라 한다.)
		 */
		// --> 새로운 작업단위 즉 새로운 Thread에서 할수만 있다면 GUI의 반응성이 더 좋아지지 않을까? (GUI 작업은 main thread에서 일어나므로)
		// 예를들어 앱을 사용할때 다운로드가 오래걸린다 --> 다운로드하는동안 아무것도 못하면 답답하니까 다운로드를 새로운 작업단위에서 하게 하고, 그동안 난 다른 일을 할 수 있게한다.
		//빠르게 처리 xx 작업을 독립적으로 처리하려고 oo 작업 스레드가 많다고 (일하는 직원이 많다고) 딱히 빨라지진 않음.
		try{
			Thread.sleep(10000);
		} catch (InterruptedException el) {
			el.printStackTrace();
		}
		System.out.println("작업이 끝났습니다.");
		
		
	}
	
	//run했을 때 app이 시작되는 아주 특별한 main 메소드
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}

}
