package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

/*
 * 읽어오기 버튼을 누르면 diary.txt에 있는 모든 문자열을 읽어와서 
 * JTextArea에 출력해보세요
 * 
 * -hint 
 * FileReader 객체를 활용하면 파일에서 문자열을 읽어낼 수 있습니다.
 */

public class MyFrame_pr01 extends JFrame{
	
	public MyFrame_pr01 (String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		
		JTextField inputText = new JTextField(20);
		JButton saveBtn = new JButton("저장");
		
		p1.add(inputText);
		p1.add(saveBtn);
		
		JButton readBtn = new JButton("읽어오기");
		JTextArea ta = new JTextArea();
		
		p1.add(readBtn);
		add(ta, BorderLayout.CENTER);
		
		
		add(p1, BorderLayout.NORTH);
		p1.setBackground(Color.YELLOW);
		
		File f = new File("C:\\acorn202304\\myFolder\\diary.");
		
		saveBtn.addActionListener((event) -> {
			String msg = inputText.getText();
			
			try {
			if(! f.exists()) {
						f.createNewFile();
				} 
			FileWriter fw = new FileWriter(f, true);
			fw.write(msg);
			fw.write("\r\n");
	    	fw.flush();
	    	fw.close();
	    	JOptionPane.showConfirmDialog(this, "저장했습니다");
	    	
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		readBtn.addActionListener((event) -> {
			FileReader fr= null;
			BufferedReader br = null;
			try {
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				
				while(true) {
					String line = br.readLine();
					if(line == null) break;
					ta.append(line);
					ta.append("\r\n");
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
				if(br != null)br.close();					
				if(fr != null)fr.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		});

		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame_pr01("연습");
	}

}

