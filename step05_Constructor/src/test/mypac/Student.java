package test.mypac;
/*
 * [생성자]
 * 
 * 1. 클래스명과 동일하다
 * 2. 메소드 모양과 유사하지만 리턴 type이 없다(void.. 이런거.. 쓰면 메소드됨...)
 * 3. 객체를 생성할 때(new할 때) 호출된다.
 * 4. 객체를 생성하는 시점에 무언가 준비 작업을 할 때 유용하다.★★
 * 5. 생성자를 명시적으로 정의하지 않아도 기본 생성자는 있다고 간주된다.(default 생성자)
 */

public class Student {
	//생성자
	public Student() {
		//객체룰 생성하는 시점에 하고싶은 작업이 있으면 여기서 작업한다
		//즉, new 하는 순간에 생성자가 호출됨
		//객체를 처음 만들떄 하는 준비작업들.. 
		//각 객체당 한번씩만 생성자가 콜이 됨.
		//생성자가 콜 되면 객체가 만들어지고 사물함에 들어가고 사물함 번호가 나옴
		//생성자도 메소드처럼 매개변수를 선언할 수 있다.
		
		// 생성자는 new하면서 콜하는거구
		// 메소드는 참조값. 찍어서 콜(non-static method) 
		// class. 해서 콜 (static method)
		System.out.println("Student 클래스의 default 생성자 호출됨");
		
		
	}
	//메소드
	public void study() {
		System.out.println("공부자아아");
	}

}
