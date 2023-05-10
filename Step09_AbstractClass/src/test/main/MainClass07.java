package test.main;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		//개발자가 코딩하는 위치
		
		//달리기는 하지만...
		useCar(new Car());
		
		//좀 더 빨리 달릴 수 없을까?
		//그렇다고 해서 누군가 미리 만들어 놓은 Car 클래스의 drive() 메소드를 수정하는 것은 불가능하다
		//방법이 없을까?
		// --> Car 클래스를 상속받는 자식 클래스를 만들어서 @override
		// 근데 새로운 클래스 만들기 귀찮으니까 익명 클래스 활용
		useCar(new Car() {
			// class ? extends Car{}
			@Override
			public void drive() {
				System.out.println("겁나 빠르게 달린다잉");
			}
		});
		
	}
	
	//누군가 미리 만들어 놓은 메소드
	public static void useCar(Car c) {
		c.drive();
		c.drive();
	}
}
