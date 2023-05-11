package quiz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//이제 마이프레임이 액션리스너이기도 함.
public class MyFrame extends JFrame implements ActionListener {
	JTextField tf_num1;
	JTextField tf_num2;
	JLabel la1;
	JLabel la2;
	//생성자
	public MyFrame(String title) {
		super(title);
		//초기 위치와 크기 설정
	    setBounds(100, 100, 900, 200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new FlowLayout());
	    
	  //문자열을 한줄 입력 할수 있는 JTextField 객체 생성
	    //만들떄는 순서 상관 없음
	    tf_num1 = new JTextField(10);
	    //생성자에서 뉴 했던 값을 필드에 저장하는 이유눈 밑에서 JTextField의 text값이 필요하기떄문에 필드에 저장.
	    JButton plusBtn = new JButton("+");
	    JButton minusBtn = new JButton("-");
	    JButton multiplyBtn = new JButton("*");
	    JButton divideBtn = new JButton("/");
	    tf_num2 = new JTextField(10);
	    la1 = new JLabel("=");
	    //필드에 있는 변수들은 지역변수 선언을 지워줘야함.
	    la2 = new JLabel("0");
	    
	  //프레임에 UI 를 추가한다. 
	    //원하는 순서대로 add한다
	    add(tf_num1);
	    add(plusBtn);
	    add(minusBtn);
	    add(multiplyBtn);
	    add(divideBtn);
	    add(tf_num2);
	    add(la1);
	    add(la2);
	    
	    //버튼에 액션 리스너로 등록을 한다.
	    //this인 이유는 마이프레임이 액션리스너를 구현했기때문에
	    //마이프레임이 액션리스너이기도 하다.
	    //모든 버튼에 똑같은 액션리스너 등록
	    plusBtn.addActionListener(this);
	    minusBtn.addActionListener(this);
	    multiplyBtn.addActionListener(this);
	    divideBtn.addActionListener(this);
	    
	    //버튼에 action command 설정하기
	    //무슨 버튼이 눌렸나 확인하기 위해서
	    plusBtn.setActionCommand("plus");
	    minusBtn.setActionCommand("minus");
	    multiplyBtn.setActionCommand("multiply");
	    divideBtn.setActionCommand("divide");
	    
	    
	    //UI 를 모두 배치하고 나중에 호출하는것이 원칙이다 
	    setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의 계산기");
	}

	@Override
	//액션 리스너 인터페이스를 구현했기때문에 강제 오버라이드 된 메소드
	//(액션리스너가 가지고 있는 추상메소드이기 때문에)
	public void actionPerformed(ActionEvent e) {
		//입력한 문자열 읽어오기
		String strNum1 = tf_num1.getText();
		String strNum2 = tf_num2.getText();
		
		try {
			//입력한 문자열을 실수(double)로 변경
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			
			
			//눌러진 버튼의 command 읽어오기
			String cmd = e.getActionCommand();
			//연산의 결과값을 담을 변수를 미리 선언하고 초기값 대입하기
			// 왜 미리 선언을 해야하는지 잘 알아아야함!
			double result = 0;
			if(cmd.equals("plus")) {
				result = num1 + num2;
			}else if(cmd.equals("minus")) {
				result = num1 - num2;
			}else if(cmd.equals("multiply")) {
				result = num1 * num2;
			}else if(cmd.equals("divide")) {
				if(num2 == 0) { 
					JOptionPane.showConfirmDialog(
							
							this, "어떤 수를 0으로 나눌 수는 없어요!");
					//여기서 메소드 종료(return)시키기
					return;
				}
				
				result = num1 / num2;
			}
			//결과값을 JLabel에 출력하기
			// double result 변수를 if문 안에서 선언해버리면 지역변수기떄문에 밖에서 못씀
			// --> if문 밖에서 선언하자
			//또한 JLabel도 여기에 불러오려면 필드에 있어야함.
			
			//숫자를(double) 문자열(string)로 바꾸기
			String resultText = Double.toString(result);
			//바꿔서 JLabel에 출력
			la2.setText(resultText);
		} catch (NumberFormatException nfe) {
			String msg = "숫자만 입력하세요" ; 
			 JOptionPane.showMessageDialog(this, msg); 
			
			
	
		}
	}
}
