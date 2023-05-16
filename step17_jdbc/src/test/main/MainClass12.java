package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		//class02와 비교해보자! 
		//데이터를 저장할 객체를 미리만들고 그 객체를 
		
		//추가할 회원의 정보
		String name = "덩어리";
		String addr = "목동";
		
		//추가할 회원의 정보를 MemberDto 객체에 담는다.
		MemberDto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//DB에 저장하기
		new MemberDao().insert(dto);
	}

}
