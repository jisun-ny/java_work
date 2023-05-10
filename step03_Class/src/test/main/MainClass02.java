package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//Car 객체를 생성해서 참조값을 Car type 지역변수 car1에 담기
		Car car1 = new Car();
		//car1에 담긴 참조값을 Car type 지역변수 car2에 복사해 주기
		Car car2 = car1;
		//Car type의 참조값을 담을 수 있는 지역변수 car3 만들기 --> 그냥 공간만 만들어 놓은 것
		Car car3 = null;
		
		// 이렇게 세줄 실행하면 객체 한개 만들어짐!(객체를 만들려면 new해야하니까)
		
		car1.name = "아반떼";
		String a = car1.name; // "아반떼"
		String b = car2.name; // "아반떼"
		
		car1.drive();
		car2.drive();
//		car3.drive(); 
//	car3은 null 비어있기 때문에 NullPointerException 발생! 참조값 없음
	}

}
