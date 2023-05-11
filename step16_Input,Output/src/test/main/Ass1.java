package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/*
 * 프레임에 
JTextField와 JButton 을 배치해서
JTextField에 문자열을 입력하고 저장 버튼을 누르면
입력한 문자열이 diary.txt파일에 누적 기록이 되도록
프로그래밍해보세요.
 */

public class Ass1 extends JFrame implements ActionListener{
	JTextField inputMsg;
	//생성자
	public Ass1 (String title) {
		super(title);
		//프레임의 초기 설정 작업하기 
	    setBounds(100, 100, 500, 500);
	    // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //레이아웃 설정
	    setLayout(new FlowLayout());
	    
	    inputMsg = new JTextField(10);
	    add(inputMsg);
	    
	    		
	    JButton saveBtn  = new JButton("save");
	    saveBtn.addActionListener(this);
	    add(saveBtn);
	   
	    
	    setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ass1("과제");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = inputMsg.getText();
		
		File f = new File("C:\\acorn202304\\myFolder/diary.");
		if (!f.exists()) {
			try {
				f.createNewFile();
				FileWriter fw = new FileWriter(f, true);
				fw.write(msg);
				fw.flush();
				fw.close();
				
				
				
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
		
		
		
		
	}

	
}
