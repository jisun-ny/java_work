package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 지역 변수나 필드 앞에 선언하는 data type은( 참조 data type)
 * 그 안에 들어있는 참조값의 사용 설명서 라고 생각하면 된다.
 * 
 * 그렇기 때문에 그 지역변수나 필드에 .을 찍으면 사용 설명서에 
 * 명시된 기능만 사용할 수 있다
 * 
 * java의 모든 객체는 다형성을 가질 수 있다.
 * 
 * 다향성은 type이 여러개라는 의미.
 * 
 */

public class MainClass02 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 나온 참조값을
		//HandPhone type 지역 변수 p1에 담기
		HandPhone p1 = new HandPhone();
		p1.takePicture();
		
		//HandPhone 객체를 생성해서 나온 참조값을
		//Phone type 지역 변수 p2에 담기
		Phone p2 = new HandPhone();
		// p2는 핸드폰 객체임에도 불구하고 
		// 설명서에는(Phone) call(){}만 명시되어 있기 때문에
		// call()만 사용 가능.
		// 그럼에도 불구하고 왜 이렇게 선언하냐....?
		// 나중에 사용설명서만 교체하면 언제든지 사용 간ㅇ
		// 어떤 객체를 부모타입으로 받아주면 프로그래밍이 유연해지기 때문에.. 
		// 더 넓은범위로 받는거니까..
		
		
		// 변수의 다형성
		// --> HandPhone객체는 HandPhone 타입 이기도 하고 Phone타입이기도 하다
		
		//HandPhone 객체를 생성해서 나온 참조값을
		// Object타입의 지역 변수 p3에 담기
		Object p3 = new HandPhone();
		// 오브젝트는 java.leng에 있는 거기 때문에 따로 임포트 필요 없음.
	
	}

}
