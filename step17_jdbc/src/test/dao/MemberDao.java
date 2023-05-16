package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 * Data Access Object 만들어보기
 * 
 * -DB에 insert, update, delete, select 작업을 대신 해주는 객체를 생성할 클래스 설계하기
 */

public class MemberDao {
	/*
	 * 회원 한명의 정보를 저장하고 해당 작업의 성공여부를 리턴해주는 메소드
	 * 							//true of false (return 타입이 boolean)
	 *  (회원 한명의 정보를 전달받아야함) --> 매개변수를 통해서
	 *  new MemberDao().insert();
	 *        				  // 여기 괄호에 MemberDto type 즉 멤버디티오 객체에 담아서 전달해준다.
	 */
	
	public boolean insert(MemberDto dto) {
		
		//필요한 객체를 담을 지역 변수 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		// insert, update, delete 작업을 통해서 변화된 (추가, 수정, 삭제) row의 갯수를 담을 변수
		int rowCount = 0;
		try {
		//Connetion  객체의 참조값 얻어옥
			conn = new DBConnect().getConn();
			
			
			//🎀🎀🎀🎀🎀🎀🎀🎀실행할 sql 문 🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀
			String sql = "INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES (member_seq.NEXTVAL, ? , ?";
			//🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀
			
			
			//sql문을 대신 실행해 줄 preparedstatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			
			
			//🎀🎀🎀🎀🎀🎀🎀🎀sql 문이 ? 가 존재한느 미완성이라면 여기서 완성한다🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀
			pstmt.setString(1, dto.getName());
			pstmt.setString(1, dto.getAddr());
			//🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀🎀
			
			
			//insert or update or delete 문을 실제 수행한다.
			rowCount = pstmt.executeUpdate(); //수행하고 리턴되는 값을 변수에 담는다
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//예외가 발생을 하든 안하든 실행이 보장되는 블럭에서 마무리 작업
			try {
				if(pstmt != null) pstmt.close();
				if(pstmt != null) conn.close();
			}catch (Exception e) {}
			}
		
			// 마지막에 rowCount를 다시 조사해서 0보다 크면 성공(true)이고 그렇지 않으면(그대로 0이면(초기값)) 실패(false)이다.
		if(rowCount > 0) {
			return true;
		}else {//그렇지 않으면 작업 실패
			return false;
		}
	
	}
}
