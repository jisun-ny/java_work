package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		//아래에 있는 useWeapon() 메소드 호출하려면 
		//Weapon type의 참조값이 필요하다
		
		
		//같은 스테틱에 들어있으니까 생략가능//new MyWeapon()도 ㄱㄴ
//		useWeapon(new MyWeapon());
		
		
		// 익명의 local inner class를 이용해서 weapon type의 참조값을 얻어내서
		Weapon w1 = new Weapon() {
			/*
			 * {} 괄호 안에 들어가는 부분은 
			 * 이름이 없는 익명의 클래스 이다!
			 * 여기는 extends Weapon 한 클래스 이다.
			 * class ? extends Weapon { }
			 * public ? () {} 생성자를 호출하는 표현식
			 * 익명의 로컬 이너클래스
			 * anonymous local inner class
			 * 꼭 추상 클래스일 필요 없다. 일반클래스도 가능.
			 * 이렇게 상속 받을 수 있음
			 * 
			 */

			@Override
			public void attack() {
				System.out.println("아무나 공격하자!");
			}
			
		};
		
//		MyWeapon w1 = new MyWeapon();
		useWeapon (w1);
		// 변수에 담아서 변수명으로 참조값 전달
		
		//메소드를 호풀할 때 바로 익명 클래스를 이용해서 Weapon type의 참조값을 얻어내서 사용하기
		useWeapon(new Weapon() {

			@Override
			public void attack() {
				System.out.println("김구라를 공격해요");
				
			}
			
		});
		
		//MyWeapon type은 필요가 없어보임..
		//필요가 있으려면(type으로 쓰이려면) 따로 추가한 메소드가 있어야하는데
		//MyWeapon은 그냥 Weapon클래스를 위해 존재 
		// --> 굳이 클래스파일을 따로 만들어야 할 필요가 없다.
		// 이름이 있는 클래스를 따로 만들지 않고
		//추상 클래스  Weapon type의 참조값을 얻어 낼 수 없을까?
	}
	//Weapon type의 참조값을 전달 받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
