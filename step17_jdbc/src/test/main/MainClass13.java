package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass13 {
	public static void main(String[] args) {
		//새로 추가할 회원정보
		String name = "누구게";
		String addr = "어디게";
		//위의 정보를 DB에 저장하고 저장이 성공되었다면 "저장했습니다"를
		//콘솔창에 출력하는 기능을 만들고 싶다면?
		
		//추가할 회원의 이름과 주소를 dto 객체에 담고
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//MemberDao 객체를 이용해서 회원 정보를 저장하고 성공 여부를 리턴받는다.
		MemberDao dao = new MemberDao();
		boolean isSuccess = dao.insert(dto);
		if(isSuccess) {
			System.out.println("저장했습니다");
		}
		//괄호에 저장하고싶은 데이터를 전달하면 자동으로 저장이되고, 그 성공여부 결과가
		//boolean type으로 나옴
	}

}
