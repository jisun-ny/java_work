package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 그 참조값을 
		//p1이라는 이름의 HandPhone type 지역 변수에 대입하기
		HandPhone p1 = new HandPhone();
		
		// p1 안에 있는 참조값을 p2 라는 Phone type 지역 변수에 대입하기
		Phone p2 = p1;
		
		// p1 안에 있는 참조값을 p3 라는 Object type 지역 변수에 대입하기
		Object p3 = p1;
		
		//자식 객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담긴다.
		//위 세 줄을 수행하면 객체는 1개 만들어짐
		
		// HandPhone p4 = p2;
		// p2는 HandPhone 객체임에도 불구하고 사용설명서(참조값이 들어있는 변수)가 phone
		// 이기 때문에 대입될 수 없음.
	}

}
