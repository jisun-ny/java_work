package frame05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.AnotherThread;
import test.mypac.CountRunnable;

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
	      
	      //카운트 다운 한 숫자가 필드에 나타나게할 것.
	      
	      JButton startBtn=new JButton("카운트 다운");
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

	//	   AnotherThread thread = new AnotherThread();
	//	   이렇게 필드에 만들어놓고 .찍어서 필요할떄마다 사용 못함!!! 스레드는 일회용임
	//	   필요할때마다 new해서 사용해야함
	@Override
	public void actionPerformed(ActionEvent e) {
//		방법 1)
//		new Thread() {
//			//class ? extends Thread{} 쟤는 이름은 없는데  Thread클래스를 상속받은 애
//			@Override
//			public void run() {
//				//카운트 값을 저장할 지역 변수 만들고 초기 값 대입
//				int count = 10;
//				//반복문 돌면서 
//				while(true) {
//					System.out.println("현재 count:"+count);
//					if(count == 0) {
//						//만일 카운트가 0이면
//						break; //반복문 탈출
//					}
//					//1초마다 
//					try{
//						Thread.sleep(1000);
//					} catch (InterruptedException el) {
//						el.printStackTrace();
//					}
//					//카운트를 1씩 감소시키고
//					count--;
//					}
//			}
//		}.start();
		
		//방법 2)
		new Thread (new Runnable() {

			@Override
			public void run() {
				//작업할 내용
			}
			
		}).start();
		
		//방법 3)
		new Thread(() -> {
			//작업할 내용
		}).start();
		//이렇게 쓸 수도 있음..
	}
	
	
	//run했을 때 app이 시작되는 아주 특별한 main 메소드
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}

}
