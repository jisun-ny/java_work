package test.mypac;

public class Member {
	
	//필드
	public int num;
	public String name;
	public String addr;
	
	//생성자 정의하기
	//생성자를 하나라도 만들면 default 생성자는 사라짐. 
	// -> new Member() 해서 객체를 만들면 오류가 뜰거임.
	// 해결하기 위해서
	// 디폴트 생성자도 직접 정의해줌
	public Member () {} //-> 그냥 객체 만들기만할거야 아무것도 안받을거야~
	public Member (int num, String name, String addr) {
				//여기서 num, name, addr은 지역변수
		//생성자의 매개변수에 전달된 값을 필드에 저장해 놓기
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
				
	//멤버 객체는 첫줄처럼 만들수도 두번째 줄처럼 만들수도 있다~ 내가 만든 생성자 방식대로
	
	//메소드
	public void printInfo() {
		System.out.println("번호:"+num+" 이름:"+name+" 주소:"+addr);
	}

}
