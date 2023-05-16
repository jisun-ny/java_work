package test.dao;
/*
 * Data Access Object
 * insert(), update(), delete(),getList(),getData()메소드 완성해보기
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnect;

public class DeptDao {

	public boolean insert(MemberDto dto) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "INSERT INTO dept"
					+ " (num, name, addr)"
					+ " VALUES(deptno_seq.NEXTVAL, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			rowCount = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		} finally {		
				try {
					if (pstmt != null)pstmt.close();
					if (conn != null)pstmt.close();
				} catch (SQLException e) {} 
				
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false; 
		}
	}
}
