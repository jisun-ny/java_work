package test.mypac;

//가상의 옛날 가정용 전화기 객체를 생성할 설계도라고 가정
public class Phone {
	// 어떤 클래스도 상속받지 않으면 자동으로 extends Object 된다.
	// Object <-- Phone <-- HandPhone
	//  기능 자체는 다 가지고 있지만 변수의 타입에 따른 사용할 수 있는 메소드가 달라짐.
	
	
	
	//생성자
	//Class명과 생성자 명은 똑같다.
	//어떠한 클래스로 객체를 생성한다는 것은 생성자를 콜! 하는 것
	//new _____ () 하는 순간 --> 참조값으로 대체가 됨
	// 생성자란 객체를 생성하는데 필요한 준비작업들을 모아둔 것
	public Phone() {
		System.out.println("Phone 생성자 호출됨");
	}
	
	//Phone p1 = new Phone()
	// 이 변수 안에 들어있는 값에 대한 데이터 타입 명시 --> 변수 속 값에 대한 사용 설명서를 명시해주는 것!
	
	
	
	//전화 거는 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}

}
