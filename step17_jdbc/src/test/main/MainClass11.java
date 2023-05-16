package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num =3; //삭제할 회원의 번호라고 가정
		
		//아래의 delete() 메소드를 이용해서 회원 정보를 삭제해 보세요.
		
		
		
		delete(num);
	}

	
	public static void delete(int num) {
		//인자로 전달된 num에 해당하는 회원정보를삭제하는 기능을 완성해 보세요
		//DBConnect 클래스 활용하세요.
		
		
		  Connection conn = null;
	      PreparedStatement pstmt = null;
	      //connection 객체의 참조값 얻어오기
	      conn = new DBConnect().getConn();
	      
	      try {
	    	  String sql = "delete from member"
	    			  + " WHERE num = ?";
	     
	    	  pstmt=conn.prepareStatement(sql);
		      //------
	    	 
	    	  pstmt.setInt(1, num);
		      //------
		      
		      //sql문 실행
		      pstmt.executeUpdate();
		      System.out.println("회원 정보를 삭제했습니다.");
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      }
		
		
		
	}
}
