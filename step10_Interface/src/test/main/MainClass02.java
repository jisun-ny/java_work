package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.Volume;

public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인 --> 다형성 : 자손 클래스의 인스턴스를 조상타입의 참조변수로 참조하는 것이 가능
		MyRemocon r1= new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
	
		//직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon() 메소드를 여기서 호출해보세요.
		
		Remocon r4 = new Volume();
		useRemocon(r4);
		
		Volume r5 = new Volume();
		r5.reserve();
	
	}

//	위는 r5에 대한 사용설명서가 volume이지만
//	아래는 사용설명서가 Remocon이기때문에 reserve()메소드를 사용할 수 없다
//	같은 값이지만 그 참조값이 담겨있는 사용설명서가 뭐냐에 따라서
//	사용할 수 있는 메소드가 달라진다.
	// (Remocon r)
	/*
	 * 개인이 만들 클래스와 메소드 명은 미리 알 수 없음. 
	 * 이미 우리가 만들어서 사용할 객체가 다 준비되어져있음 
	 * --> 미리 만들어져있는 유틸리티나 프로그램을 사용할때는 클래스명은 내맘대로 지을 수 있지만 그 클래스가 어떤 클래스, 인터페이스..를 상속받을지는 거의 정해져있음
	 */
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		//만일 여기 안에서 reserve() 메소드를 굳이굳이 사용하고싶으면? 
		Volume r6 = (Volume)r; //단 여기들어가는 r값이 볼륨 타입이란느 것이 확실한 경우에만..
		r6.reserve();
	}

}
