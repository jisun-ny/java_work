package test.mypac;
/*
 * 인터페이스를 implements 하면 인터페이스에 정의 되어 있는 모든 추상메소드를 오버라이드 해야한다.(강제)
 */

public class MyRemocon implements Remocon{
					//extends Object
	//public MyRemocon() {} 디폴트 생성자
	
	//		type? 	r	 = new MyRemocon();
	// 1. Object
	// 2. MyRemoncon
	// 3. Remocon

	@Override
	public void up() {
		System.out.println("채널을 올려요");
	}

	@Override
	public void down() {
		System.out.println("채널을 내려요");
	}

}
