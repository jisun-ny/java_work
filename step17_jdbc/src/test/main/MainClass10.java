package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num = 1;
		String name = "호빵";
		String addr = "독산동";
		
		//MemberDto 객체를 생성해서
		MemberDto dto2 = new MemberDto();
		//수정할 회원 정보를 담고
		dto2.setNum(num);
		dto2.setName(name);
		dto2.setAddr(addr);
		//update()메소드의 매개변수에 전달해서 회원 정보가 수정되도록 한다.
		update(dto2);
		// main 메소드와 update 메소드는 같은 클래스이기 떄문에 MainClass10. 생략가능
		
	}

	
	//회원 한명의 정보를 수정하는 메소드
	public static void update(MemberDto dto) {
		  //지역변수를 미리 선언하구
		  Connection conn = null;
	
	      //sql문을 대신 실행해 줄 객체의 참조값을 담을 지역변수 미리 만들기
	      PreparedStatement pstmt = null;
	      
	      //connection 객체의 참조값 얻어오기
	      conn = new DBConnect().getConn();
	      
	      
	      try {
	      String sql = "UPDATE member"
	    		  + " SET name = ?, addr = ?"
	    		  + " WHERE num= ?";
	      //미완성의 sql문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
	      pstmt=conn.prepareStatement(sql);
	      //PreparedStatement 객체의 메소드를 이용해서 미완성인  sql문으 완성시키기 (?에 값 바인딩하기)
	      //여기서 1,2,3의 의미는 물음표의 번호 // num, name, addr에 인자 
	      
	      //모든 insert, update, delete 문은 다 같은 모양이고 아래부분만 모양이 다름. (select문은 결과가있는거니까 result문이 나와서 조금 다름) String sql = 수정도 잊지말기
	      //----------------------------------
	      
	      pstmt.setString(1, dto.getName()); //1번째 ?에 문자 바인딩
	      pstmt.setString(2, dto.getAddr());//1번째 ?에 문자 바인딩
	      pstmt.setInt(3, dto.getNum());
	      //----------------------------------
	      
	      //sql문 실행하기
	      pstmt.executeUpdate();
	      System.out.println("회원의 정보를 수정했습니다.");
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      }
	}
}

