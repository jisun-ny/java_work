package test.frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestEMP {
	public static void main(String[] args) {
		Connection conn = null;
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
		//SELECT작업을 위해서 필요한 객체의 참조값을 담을 지역변수 만들기
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String  sql = "SELECT empno, ename, deptno, job"
					+ " FROM emp"
					+ " ORDER BY empno ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int deptno = rs.getInt("deptno");
				String job = rs.getString("job");
				
				System.out.println(empno+" | "+ename+" | "+deptno+" | "+job);
			}
			}catch(Exception e){
				e.printStackTrace();
				}
		}
		

}
