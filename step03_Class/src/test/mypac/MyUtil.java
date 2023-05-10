package test.mypac;

public class MyUtil {
	//static 필드
	public static String version="1.0.0";
	//static을 붙이면 static영역에 MyUtil이라는 클래스가 올라가고 안에 version필드와 send(){} 메소드 존재
	//클래스 당 하나씩! 
	
	
	// static method
	
	//	public void send() {
	//		System.out.println("전송합니다.");
	//	}
	//new MyUtil().send(); 이렇게 사용함 원래 보통.
	// new를 사용해서 객체를 먼저 만들고 . 찍어서 사용
	
	public static void send() {
	System.out.println("전송합니다.");
	}
	//이렇게  static을 붙이면 
	//	메모리 static 영역에 
	//	MyUtil class 에 감싸져서 send() {} 이게 존재하게 됨
	//  MyUtil.send(); 그냥 이렇게 사용하면 됨. 즉 그냥 클래스 명에 .찍어서 사용할 수 있다.
	//  우리가 사용하고자 하는 필드와 메소드가 스태틱 영역에 존재할 때.
	//  Car의 경우 이름이 어떤건 소나타 어떤것 제네시스 이런건 static 영역에 존재할 수 없음.
}
