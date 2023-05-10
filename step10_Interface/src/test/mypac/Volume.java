package test.mypac;

public class Volume implements Remocon{

	@Override
	public void up() {
		System.out.println("소리 업");
		
	}

	@Override
	public void down() {
		System.out.println("소리 다운");
		
	}
	
	//그런데.. 나는 내가 사용할 편리한 메소드를 하나 더 만들고 싶다..
	// --> 만들어버리셈..
	
	public void reserve() {
		System.out.println("소리를 5로 바꾸는것을 예약합니다");
	}

}
