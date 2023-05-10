package test.mypac; //package명은 아이디 역할을 할 수 있어야한다.
/*
 *  class의 역할
 *  1. 객체의 설계도 역할
 *  -객체는 heap 영역(사물함)에 들어 있는 물건이라고 생각하면 된다.
 *  -class를 이용해서 객체를 원하는 시점에 원하는 갯수 만큼 만들어 낼 수 있다.
 *  -만들어진 객체가 어떤 저장소(field)와 어떤 기능(method)을 가지게할지 class로 설계할 수 있다.
 *  
 *  2. data type의 역할
 *  	int a = 10;
 *  	String b = "kim";
 *  	Car c = ? ; 어떻게 하면 우리가 만든 Car클래스를 이용해서 객체를 만들고 참조값을 얻어 낼 수 있을까..
 *  3. static 필드와 메소드를 포함하는(감싸는) 역할
 */

public class Car {
	/*
	 *  [필드 정의하기]
	 *  - 클래스의 {} 중괄호 안에 아래와 같은 형식으로 정의할 수 있다.
	 *  - 초기값을 부여하지 않으면 기본 값이 들어간다.
	 *  - int의 기본 값은 0, boolean의 기본값은 false, 참조데이터 type의 기본값은 null
	 *  
	 *  접근지정자 data type 필드명 = 초기값;
	 *  (필드는 지역변수가 아니다!!)
	 */
	
	public String name; // 자동으로 null이 들어감
	public int price; // 0
	
	/*
	 *  [메소드 정의하기]
	 *  
	 *  접근지정자  return type 메소드명() {
	 *  }
	 */
	public void drive () {
		//여기는 method 안쪽 블럭!
		// drive() 메소드가 call 되었을 때 
		// 실행할 java code를 여러 줄 모아 놓을 수 있다.
		System.out.println(this.name + "가(이) 달려요");
//		return this; 를 하게되면 메소드의 타입을 void에서 Car로 바꿔야함.
		
		Car a = this; 
		// a는 Car type
	}
	
	public void showInfo () {
		System.out.println("차의 이름은 " + this.name +"이고 가격은 " + this.price + "만원 입니다.");
	}
	
}
