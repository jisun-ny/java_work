package test.mypac;

//미완성된 추상 메소드를 멤버로 가지고 있는 클래스는 abstract 예약어를 붙여서 정의해야 한다.
public abstract class Weapon {

	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	
	public abstract void attack();
	//				리턴타입	이름 인자 --> {}이 없음 --> 미완성
	// 이런 abstract 메소드를 갖는 클래스는 클래스 명에도 abstract를
	// 붙여놔야함.
	
	// Weapon w = new Weapon();
	// 디폴트 생성자가 존재함에도 불구하고 안됨.
	// w.prepare(); ok
	// w.attack(); 이건 성립이 안됨. 완성되지 않은 메소드가 존재하기 떄문에 안됨.
}

/*
 * 우리는 만들어진 유틸리티를 import해서 사용하는 입장.
 * 이경우 유틸리티 개발자들이 이런걸 만들때 
 * 우리는 어디가 어택받을지 모름
 * 우리가 지금 다 정해버릴 수 없으니까 
 * 일단 이렇게 기반 시설들만 만들어서 미완성으로 제공해 놓을게~
 * 
 * 하면 우리가 import해서 프로젝트 상황에 맞게 override해서 사용
 * (상속받아 자식 클래스에서 override)
 */