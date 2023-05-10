package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	
	//이너 클래스 (클래스 안의 클래스)
	static class SeaWeapon extends Weapon {
		// main 클래스가 static이기 때문에 main class안에서
		// 사용하려면 static을 붙여줘야함
 		// --> 이런 이너 클래스를 사용해서
		//file을 따로 만들지 않고 클래스를 정의

		@Override
		public void attack() {
			System.out.println("바다에 있는 적들을 공격해요");
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// 바다를 공격하는 무기를 만들어서 사용하고 싶다.
		Weapon w1 = new SeaWeapon();
		w1.prepare();
		w1.attack();
	
	//우주를 공격하는 무기를 만들어서 이용하자
	//지역 내부 클래스 (메소드 안의 클래스)
	class SpaceWeapon extends Weapon {
		@Override
		public void attack() {
			System.out.println("우주에 있는 적들 공격!");
		}
	}
		
		Weapon w2 = new SpaceWeapon();
		w2.attack();
		w2.prepare();
	}
	
	}
	



