package test.auto;

public class Bus extends Car{
	//↑오류난거에 커서를 올려보면 quick fixer 클릭
	// 부모 생성자에서 필요한 값을 자식 생성자에서 받아서 전달해 주는 코드가 있어야 문법이 성립된다.
	
	//↓Engine type을 전달받는 생성자 
	public Bus(Engine engine) {
		//super() 호출 이전에 다른 코드를 한줄이라도 실행하면 실행 안됨.
		super(engine);
		//↑부모 생성자 super()	
	}
	
	public void powerDrive() {
		//ctrl+space 눌러보면 engine객체가 있는 것을 볼 수 있다. 이 객체는 protected
		//같은 패키지 안에 들어있기도 하지만 부모의 필드이기때문에 자기꺼처럼 쓸 수 있다.
		if(this.engine == null) {
			System.out.println("Engine 객체가 없어서 달릴 수가 없어요(power drive)");
			return; //메소드 끝내기
		}
		System.out.println("승객을 태우고 힘차게 달려요");
	}

}
