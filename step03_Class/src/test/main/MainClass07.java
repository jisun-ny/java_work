package test.main;

public class MainClass07 {
	
	public static int num = 999;
	
	// main 메소드는  static method이다
	// 따라서 field가 필요하다면 static영역에 있는 필드만 사용 가능
	public static void main(String[] args) {
		//에러가 나는 이유..
		// 클래스명.필드명 형식으로 static 필드를 참조 한다
//		int result = this.num + 1;
		int result = MainClass07.num + 1;
		
		// main() 메소드와 num 필드는 둘 다  MainClass07 안에 속해 있으므로(같은 공간)
		// 클래스명. 은 생략 가눙하다.
		int result2 = num + 1;
	}

	
	// 위 static필드와 static 메소드는 이미 클래스에 존재. 실체함
	
	// 하나의 클래스 안에는 여러개 필드, 메소드 존재할 수 있음
	
	//하지만 스테틱이 예약어가 붙지 않은 필드나 메소드는 바로 사용 할 수 없다
	//설계도에 불과
	//따라서 this. 사용 불가(new 해서 만든 다음 가능)
	// static이면 this.test() 가능
	// 이런 경우 this.는 생략 가능하기 때문에
	// test() 도 가능. 즉 MainClass07.test()에서 MainClass07. 가 생략된 것.
	// this --> 객체 안에서 자기 자신을 가리키는 예약어
	
	public void test() {
		System.out.println("test() 메소드가 호출되었습니다.");
	}
}
