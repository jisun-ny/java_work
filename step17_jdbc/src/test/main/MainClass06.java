package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass06 {
	public static void main(String[] args) {
		//sequence를 통해서 번호를 집어 넣어보기!
		
		//member 테이블에 추가할 회원의 정보라고 가정
		//int num = 4; --> 번호는 필요없음!! sequence를 통해서 집어 넣을거니까!
		String name = "김구라";
		String addr = "노량진";
		//run했을떄 이 정보가 오라클 db에 들어가게 하기
		
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
	      
	      //sql문을 대신 실행해 줄 객체의 참조값을 담을 지역변수 미리 만들기
	      PreparedStatement pstmt = null;
	      
	      
	      try {
	      String sql = "INSERT INTO member"
	    		  + " (num, name, addr)"
	    		  + " VALUES(member_seq.NEXTVAL, ?, ?)";
	      //미완성의 sql문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
	      pstmt=conn.prepareStatement(sql);
	      //PreparedStatement 객체의 메소드를 이용해서 미완성인  sql문으 완성시키기 (?에 값 바인딩하기)
	      //여기서 1,2,3의 의미는 물음표의 번호 // num, name, addr에 인자 
	      
	      //모든 insert, update, delete 문은 다 같은 모양이고 아래부분만 모양이 다름. (select문은 결과가있는거니까 result문이 나와서 조금 다름) String sql = 수정도 잊지말기
	      //----------------------------------
	      
	      pstmt.setString(1, name); //1번째 ?에 문자 바인딩
	      pstmt.setString(2, addr); //1번째 ?에 문자 바인딩
	      //----------------------------------
	      
	      //sql문 실행하기
	      pstmt.executeUpdate();
	      System.out.println("회원의 정보를 저장했습니다.");
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      }
	      
	      
	}

}
