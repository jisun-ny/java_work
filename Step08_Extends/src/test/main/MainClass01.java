package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * Phone 클래스를 상속받은 HandPhone 클래스로 객체를 생성해서
		 * 그 참조값을 p1이라는 이름의 지역변수에 담기
		 */
		HandPhone p1 = new HandPhone();
		p1.call(); // Phone 클래스로부터 상속받은 call() 메소드도 사용 가능
		//HandPhone 입장에서 Phone 클래스는 부모 클래스(상위 클래스)
		
		/* HandPhone 클래스의 생성자를 호출해서 객체를 생ㅅㅇ했더니
		 * Phone 클래스의 생성자도 호출되는 것을 알 수 있다
		 * 따라서 HandPhone 객체도 생성되고 Phone 객체도 같이 생성되었다는 것을 유추가능
		 * Phone 객체와 HandPhone객체가 생성되어서 각은 사물함에 들어간다
		 * 
		 * 즉, 하나의 참조값으로 Phone의 기능, HandPhone의 기능을 모두 사용할 수 있다.
		 *  heap 영역 id=27에
		 *  call(){}
		 *  mobileCall(){}
		 *  takePicture(){} 저장 되어 있따.
		 *  사물함 하나에 자식 객체, 부모객체 같이 들어 있다!
		 *  부모객체가 먼저 만들어지고 자식 객체가 만들어짐.
		 */
		
		p1.call();
		p1.mobileCall();
		p1.takePicture();
	}
	

}
