package test.main;

public class MainClass04 {
	
	
	//static 메소드 안에서 사용할면 static 예약어 필요
	//static이 붙으면 static 영역에 저장되니까
	public static class Gura{
		public void say() {
			System.out.println("나는 구라야");
		}
	}
	
	//static 메소드
	public static void main(String[] args) {
		Gura g = new Gura();
		g.say();
		// 메소드 안에도 클래스를 정의할 수 있다.
		// 메소드 안에 정의한 클래스를 지역 내부 클래스(지역 클래스) 라고 한다.
		// (Local Inner Class)
		// 그냥 이너클래스는 클래스 안의 클래스
		// 메소드 내부에서만 사용할 수 있다.
		class Cat{
			public void say() {
				System.out.println("야옹!");
			}
		}
		
		Cat c = new Cat();
		c.say();
		
	}

}
