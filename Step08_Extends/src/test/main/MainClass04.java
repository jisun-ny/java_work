package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 나온 참조값을 
		//Object type p3이라는 지역번수에 담아보세요
		
		Object p3 = new HandPhone();
		//Object type p3 변수에 담긴 값을 Phone type p2라는 변수에 담기
		// Phone p2 = p3
		// 안됨. 모든 Object타입이 Phone타입이 아니니꼐루
		//Object타입이 Phone타입일 가능성은 0%는 아님.
		Phone p2 = (Phone)p3;
		//이렇게 casting 연산자를 사용하면 가능.
		
		//Object type p3 변수에 담긴 값을 HandPhone type p1
		//이라는 변수에 담기
		HandPhone p1 = (HandPhone)p3;
	}

}
