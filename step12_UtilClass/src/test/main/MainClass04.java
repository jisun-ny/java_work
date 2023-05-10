package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type을 저장할 수 있는 ArrayList 객체를 생성해서
		// 참조값을 List 인터페이스 type 지역변수  cars에 담아보세요 --> 이 ArrayList객체는 Car 객체의 참조값을 여러개 담기 위해서 생성
		List<Car> cars = new ArrayList<> ();
		
		
		// 2. Car 객체 (3개)를 생성해서 List 객체에 저장해 보세요 --> Car객체는 어떻게 생성하지? --> new Car("xxx");
		cars.add(new Car("소나타"));
		cars.add(new Car("아반떼"));
		Car car1 = new Car("그랜져");
		cars.add(car1);
		
		// ---> 여기까지 진행되면 총 7개 객체 생성됨. new 4개, 스트링 3개. 
		//이 스트링은 car객체의 필드에 저장되어있따. 
		
		
		
		
		// 3. 일반 for문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		// 순서대로 호출해보세요
		for (Integer i = 0; i<cars.size(); i++) {
			Car tmp = cars.get(i); //제너릭이 카타입이기 떄문에! get이 리턴하는 타입이 car차입이다.
			tmp.drive();
		}
		
		// 4. 확장 for문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
		for (Car tmp : cars) {
			tmp.drive();
		}
		
		// 5. Consumer 인터페이스를 활용해서 List객체에 저장된 모든 Car 객체의 drive() 메소드를 순서대로 호출
		cars.forEach((tmp) -> {
			tmp.drive();
		});
	}

}
