package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
//		Remocon r1 = null;
//		r1.up();
//		r1.down(); // --> null point exception
		
		//어떻게 하면 Remocon 인터페이스 type의 참조값을 얻어낼 수 있을까?
		
		//하위 클래스를 만들자! buttt 상속은 아님!!! 구현하는 것!!
		// class -> extends // interface -> inplements
		//인터페이스로 단독 객체 못만드니까 인터페이스를 implements 받아 오버라이드해서 객체 생성해서 씀
		Remocon r1 = new MyRemocon();
		
		r1.up();
		r1.down(); // --> null point exception
		
	}

}
