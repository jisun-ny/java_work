package test.main;

import test.mypac.Car;

public class MainClass01 {
	// run했을 때 실행의 흐름이 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		
	/*
	 * 만일 달리고싶다면 어떻게 해야할까?
	 * --> 달리는 기능을 가지고 있는 객체를 생성해야함.
	 */
		
	//Car 클래스로 객체를 생성하고 생성된 객체의 참조값을 car1이라는 지역 변수에 담기
      Car car1 = new Car();
      
	// 클래스 명 Car 치고 ctrl+space 누르면 자동 import할 수 있다.
	 
    //Car 객체의 참조값에 .찍어서 메소드 호출하기  
      car1.drive();
    
    //Car 객체의 참조값에 .찍어서 필드 참조하기(참조해서 값 대입하기)
      car1.name = "소나타";
      car1.price = 1000;
      
     Car car2 = new Car();
 	 car2.drive();
 	 car2.name = "그랜저";
 	 car2.price = 2000;
 	 
 	 boolean result = car1 == car2; //false
 	 boolean result2 = car1.name == car2.name; //false
	}
	
//	in js
//	let car1 = { 
//			name:null, 
//			price: 0,
//			drive: function () {}
//	}
			
	}
	
	 
