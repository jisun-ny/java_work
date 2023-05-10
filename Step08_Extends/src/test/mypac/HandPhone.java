package test.mypac;

//Phone 클래스를 상속받아서 HandPhone 클래스를 만들겠다
// --> extends Phone 사용
// 이미 잘 만들어진 클래스를 상속받으면 추가 기능만 따로 만들면 됨.
// 내가 개발자가 되고싶으면? 나 extends 개발자 ~ 
// 하나씩만 extends 할 수 있다! 다중 상속 불가능.
// 가수  extends 개발자
// 나 extends 가수
// 개발자를 상속받은 가수를 내가 상속받는다면
// 나는 가수이자 개발자가 됨.
// 이런식으로 여러가지 상속받는건 가능하지만 한번에 두가지를 상속받는 건 불가능.

public class HandPhone extends Phone{
	// 전화 거는 메소드는 다시 만들 필요 없다.
	// Phone에 그 기능이 있기 떄문에 자동 상속
	
	// 생성자
	public HandPhone() {
		System.out.println("HandPhone 생성자 호출됨");
	}
	
	// 메소드
	public void mobileCall() {
		System.out.println("이동중에 전화를 걸어요");
	}
	 //사진 찍는 메소드
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요");
	}
}
