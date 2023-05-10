package test.main;

import test.mypac.AndroidPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//AndroidPhone 객체를 생성해서 참조값 AndroidPhone type p1이라는 지역 변수에 담기
		AndroidPhone p1 = new AndroidPhone();
		//메소드 호출해보기
		p1.call(); //Phone 객체의 기능
		p1.mobileCall();//HandPhone 객체의 기능
		p1.takePicture();//HandPhone 객체의 기능
		p1.doInternet();//AndroidPhone 객체의 기능
		p1.showPlatform();//AndroidPhone 객체의 기능
	} 
	
	/*
	객체안에서 자기 자신의 참조값을 가리키는 예약어 this
	한 사물함 안에서 바로 위의 객체(부모객체)를 가리키는 예약어 super
	*/
	
	/*
	 * 부모로부터 상속받은 메소드가 맘에 안들거나 내 상황에 맞게 커스텀이 
	 * 필요한 경우 부모 클래스를 수정하지 않고 고칠 수 있따.
	 * --> @override
	 */
	
	/*
	 * 한번 오버라이드 된 메소드는 호출됐을 때 참조값을 어떤 type으로 받던간에 
	 * @override 버전으로 호출된다.
	 * 
	 * 부모 메소드를 다시 호출하고싶으면 super.takePicture()로 호출
	 */
}
