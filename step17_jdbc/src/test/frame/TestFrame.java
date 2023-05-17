package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class TestFrame extends JFrame implements ActionListener{
	//생성자에 있던 지역변수를 필드로 가져오기
	JTextField inputName;
	JTextField inputAddr;
	DefaultTableModel model;
	
	//생성자
	public TestFrame (String title) {
		super(title);
		
		//레이아웃 매니저 설정
		setLayout(new BorderLayout());
		
		
		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);
		
		JLabel label2 = new JLabel("주소");
		inputAddr = new JTextField(10);
		
		JButton addBtn = new JButton("추가");
		addBtn.setActionCommand("add");
		addBtn.addActionListener(this);
		

		
		
		
		//패널에 UI를 배치하고
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(addBtn);
		
		//패널채로 프레임의 북쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		panel.setBackground(Color.yellow);
		
		JTable table = new JTable();
		String[] colNames = {"번호", "이름", "주소"};
		//테이블에 연결할 모델객체 생성(테이블에 출력할 데이터를 여기에 추가하면 테이블에 출력된다.)
		model = new DefaultTableModel(colNames, 0);
		//모델을 테이블에 연결한다. // 데이터를 바로 테이블에 연결할 순 없고 모델에 넣어주면 변환시켜서 테이블에 알아서 잘 출력해
		//row하나의 배열을(data)를 TableModel에 넣어줌  Object[] a = {1, "kim", "seoul"} 줌
		//자바의 모든 데이트는 오브젝트니까 오브젝트 타입은 다 담을 수 이음 
		//하이튼 그러면 TableModel이 알아서 테이블에 출력해줌
		
		table.setModel(model);
		//스크롤이 가능하도록 테이블을 JScrollPane에 감싼다.
		JScrollPane scroll = new JScrollPane(table);
		//테이블을 프레임의 중앙에 배치한다.
		add(scroll, BorderLayout.CENTER);
		
		//JTable에 출력할 sample 데이타
//		Object[] row1 = {1, "김구라", "노량진"};
//		Object[] row2 = {2, "해골", "행신동"};
//		Object[] row3 = {3, "원숭이", "상도동"};
		
		//sample 데이터 모델이 추가하기
//		model.addRow(row1);
//		model.addRow(row2);
//		model.addRow(row3);
		
		//위 작업을 MemberDto 활용하여 해보기
		//회원 목록 얻어오기 //생성자니까 런하는 순간 바로 (객체가 생성되는 순간) 출력됨
		List<MemberDto> list = new MemberDao().getList();
		for (MemberDto tmp: list) {
			//MemverDto 객체 하나 당 Object[]를 하나씩 만들어서 
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			//모델에 추가하기
			model.addRow(row);
		}
		
		//이름과 주소를 입력하고 추가 버튼을 누르면 실제로 member테이블에 저장하고 "추가했습니다" 알림을 띄우고 
		//JTable에 출력할 내용을 다시 읽어와서 다시 출력하기
		
		

		

		
		
		//부모 객체의 메소드를 마음대로 호출할 수 있음. this 생략 가능 (JFrame을 상속받았기 떄문에)
		// 이 곳의 위치는 --> TestFrame 객체 안쪽 (heap영역)
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setBounds(100, 100, 800, 500);
//		this.setVisible(true);
	
	}

	//run했을 때 실행의 흐름이 시작되는 main 메소드
	//run 버튼을 누르면 TestFrame.main(); 이 실행 되는 것. static 영역에 class TestFrame에 감싸진 main statitc method 저장되어있다.
	public static void main(String[] args) {
		// 이 곳의 위치는 클래스 안쪽!(static  영역)
		// 따라서 힙영역에 있는 객체의 참조값을 받아서 사용.
		TestFrame f = new TestFrame("테스트 프레임");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	  @Override
	   public void actionPerformed(ActionEvent e) {
	      //눌러진 버튼의 액션 command 를 읽어와서 
	      String cmd=e.getActionCommand();
	      if(cmd.equals("add")) { //만일 추가 버튼을 눌렀다면
	         //1. 입력한 이름과 주소를 읽어와서
	         String name=inputName.getText();
	         String addr=inputAddr.getText();
	         //2. MemberDto 객체에 담고
	         MemberDto dto=new MemberDto();
	         dto.setName(name);
	         dto.setAddr(addr);
	         //3. MemberDao 객체의 insert() 메소드를 이용해서 DB 에 실제 저장하고 
	         boolean isSuccess=new MemberDao().insert(dto);
	         //4. 저장성공이면 "저장했습니다" 를 알림에 띄우고
	         if(isSuccess) {
	            JOptionPane.showMessageDialog(this, "저장했습니다");
	            //5. JTable 에 회원목록이 다시 출력되도록 한다.
	            //기존에 출력된 내용을 모두 삭제 후 다시 출력
	            model.setRowCount(0);
	            //회원목록얻어오기
	            List<MemberDto> list = new MemberDao().getList();
	    		for (MemberDto tmp: list) {
	    			//MemverDto 객체 하나 당 Object[]를 하나씩 만들어서 
	    			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
	    			//모델에 추가하기
	    			
	    			model.addRow(row);
	    		}

	         }
		
	      }

	  }
}
