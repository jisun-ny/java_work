package test.mypac;
/* 
 * 추상클래스를 상속받은 자식 클래스는 부모의 추상 메소드를 모두 오버라이드(재정의)
 * 해야한다
 */
public class MyWeapon extends Weapon {
	//어찌보면 
	// MyWeapon 클래스는 
	//부모 클래스의 미완성을 완성 시키기 위한 희생양..ㅋㅎ

	//부모 클래스의 추상메소드를 반드시(강제로) 오버라이드 해야한다.
	@Override
	public void attack() {
		//어디를 공격할지는 프로젝트 상황에 맞게 마음대로 공격하면 된다.
		System.out.println("지상 공격을 해요!");
		
	}
	

}
