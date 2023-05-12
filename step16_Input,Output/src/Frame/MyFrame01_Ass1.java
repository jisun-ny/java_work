package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * 프레임에 
JTextField와 JButton 을 배치해서
JTextField에 문자열을 입력하고 저장 버튼을 누르면
입력한 문자열이 diary.txt파일에 누적 기록이 되도록
프로그래밍해보세요.
 */

public class MyFrame01_Ass1 extends JFrame{
	JTextField inputText;
	//생성자
	public MyFrame01_Ass1 (String title) {
		super(title);
		//프레임의 초기 설정 작업하기 
	    setBounds(100, 100, 500, 500);
	    // 마이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //레이아웃 설정 BorderLayout으로 설정
	    setLayout(new BorderLayout());
	    
	    //UI를 감쌀 Panel
	    JPanel p1 = new JPanel();
	    
	    inputText = new JTextField(20);
	    JButton saveBtn  = new JButton("save");
	    
	    //패널에 UI를 추가
	    p1.add(inputText);
	    p1.add(saveBtn);
	    
	    //패널을 프레임의 북쪽에 배치
	    add(p1, BorderLayout.NORTH);
	    //패널의 배경색
	    p1.setBackground(Color.yellow);
	    
	    /*
	     * 읽어오기 버튼을 누르면 diary.txt에 있는 모든 문자열을 읽어와서 
	     * JTextArea에 출력해보세요
	     * 
	     * -hint 
	     * FileReader 객체를 활용하면 파일에서 문자열을 읽어낼 수 있습니다.
	     */
	    
	    JTextArea ta = new JTextArea();
	    add(ta, BorderLayout.CENTER);
	    
	    JButton readBtn = new JButton("읽어오기");
	    p1.add(readBtn);
	    
	    setVisible(true);
	    
	    File f = new File("C:\\acorn202304\\myFolder\\diary.");
	    
	    // 버튼에 리스너 등록! 함수형태로 해보자!
	    saveBtn.addActionListener((e2) -> {
	    	//익명의 이너클래스르 사용하면 바깥 영역에 정의된 지역변수 자유롭게 참조 가능
	    	// 익명이너클래스아니라면 객체를 만들어서 사용해야함.
	    
	    	//입력한 문자열 읽어오기
	    	String msg = inputText.getText();
	    
	    	
	    	
	    	try {
	    	if(! f.exists()) {
	    		f.createNewFile();
	    	}
	    	//파일에 문자열을 출력할 객체
	    	FileWriter fw = new FileWriter(f, true);
	    	fw.write(msg);
	    	fw.write("\r\n");
	    	fw.flush();
	    	fw.close();
	    	JOptionPane.showConfirmDialog(this, "저장했습니다");
	    	
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    
	    	// \역슬래쉬 하나를 쓰면 그 다음 문자를 무시하게 됨. 따라서 문자열 안에 \를 넣고싶으면 \\두개를 넣어서 뒷 문자가 무시되지 않도록해야함.
	    });
	    
	    
	    readBtn.addActionListener((e2) -> {
	    	//try 블럭 안에서 사용할 변수를 미리 만들어 놓는다.
		    FileReader fr = null;
		    BufferedReader br = null;
	    	try {
	    		//참조값은 try 블럭 안에서 new해서 넣어준다.
	    		fr = new FileReader(f);
				br = new BufferedReader(fr);
				//반복문을 돌면서
				while(true) {
					
					//문자열을 한줄씩 읽어낸다.
					String line = br.readLine();
					//만일 더이상 읽을 문자열이 없다면
					if(line==null) break;//반복문 탈출
					//읽어낸 문자열을 JTextArea에 출력하기
					ta.append(line); //개행기호는 제외한 상태로 읽어내기 떄문에
					ta.append("\r\n");//개행기호를 따로 추가해준다.
				}
				//사용했던 스트림은 닫아주는 것이 좋다.
				//열렸던 순서의 역순으로 닫아주자...
				//여기에 이렇게 코딩하면 익셉션이 발생하면 여기를 건너뛰고 캐치로 넘어가기 떄문에
				// finally에 작성하자
//				br.close();
//				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					//close()를 호출할떄도 null 에 주의해서 호출해야한다.
					if(br!=null)br.close();
					if(fr!=null)fr.close();
					//br,fr 변수는 지역변수기때문에 바깥영역에서 변수를 선언하고
					//참조값은 try 안에서하자.
				} catch (Exception e) {
					
				}
			}
	    });
	   
	    
	}
	
	public static void main(String[] args) {
		new MyFrame01_Ass1("과제");
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String msg = inputText.getText();
//		
//		File f = new File("C:\\acorn202304\\myFolder/diary.");
//		if (!f.exists()) {
//			try {
//				f.createNewFile();
//				FileWriter fw = new FileWriter(f, true);
//				fw.write(msg);
//				fw.flush();
//				fw.close();
//				
//				
//				
//			} catch (IOException e1) {
//				
//				e1.printStackTrace();
//			}
//		}
//		
//		
//		
//		
//	}

	
}
