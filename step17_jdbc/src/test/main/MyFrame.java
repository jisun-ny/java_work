package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	JTextField inputNum ;		
	JTextField inputName; 
	JTextField inputAddr ;
	
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		inputNum = new JTextField(10);		
		inputName = new JTextField(10);
		inputAddr = new JTextField(10);
		JButton saveBtn1=new JButton("저장");
		
		add(inputNum);
		add(inputName);
		add(inputAddr);		
		add(saveBtn1);
		
		saveBtn1.addActionListener((event) -> {
			//DB 연결객체를 담을 지역 변수 만들기
		      Connection conn=null;
		      
		      try {
		         //오라클 드라이버 로딩
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         //접속할 DB 의 정보 @아이피주소:port번호:db이름
		         String url="jdbc:oracle:thin:@localhost:1521:xe";
		         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
		         conn=DriverManager.getConnection(url, "scott", "tiger");
		         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
		         System.out.println("Oracle DB 접속 성공");
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		      
		      
		      int num = Integer.parseInt(inputNum.getText());
		      String name = inputName.getText();
		      String addr = inputAddr.getText();
		      
		      
		      PreparedStatement pstmt = null;
		      
		      try {
		    	  
		    	  String sql = "INSERT INTO member(num, name, addr)" 
		    			  + " VALUES (?, ?, ?)";
		    			  
		    	  pstmt=conn.prepareStatement(sql);
		     
			      //------
		    	  pstmt.setInt(1, num);
		    	  pstmt.setString(2, name);
			      pstmt.setString(3, addr);
			      //------
			      
			      //sql문 실행
			      pstmt.executeUpdate();
			      System.out.println("회원 정보를 INSERT했습니다.");
		      } catch (Exception e) {
		    	  e.printStackTrace();
		      }
		});
		
		
		
		
		setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new MyFrame("퀴즈 프레임");
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
