package test.dto;
/*
 * Data Transfer Object
 * 
 * -여러가지의 정보를 하나의 객체에 담기 위해 설게된 클래스
 * -필드의 접근 지정자는 모두 private
 * -접근 메소드 setter, getter 메소드가 있어야한다.
 * -디폴트(기본)생성자가 있어야한다.
 * -인자로 필드의 모든 값을 전달 받는 생성자도 있어야한다.(있으면 좋음 option)
 * 
 * 
 */
public class MemberDto {
	//필드의 접근 지정자를 private로 설정
	/* MemberDto m = new MemberDto();
	 * m.num = 1; ❌❌이런식으로 접근❌❌
	 * m.setNum(1); 이런 식으로 접근해야함 
	*/ 
	private int num;
	private String name;
	private String addr;
	
	/*
	 * 필드의 data type과 필드명만 정해지면
	 * 생성자, setter, getter메소드도 정해진 것이기 때문에 eclipse의 generator기능을 사용해서 만들 수 있다.
	 */
	
	//디폴트 생성자
	public MemberDto() {}

	// 마우스 우클릭 -> source -> generate 메뉴에서 constructor와 setter, getter메소드 생성 가능
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	//마우스 우클릭 -> source -> generate 메뉴에서 constructor와 setter, getter 메소드 생성 가능
	
}
