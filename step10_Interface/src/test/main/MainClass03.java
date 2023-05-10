package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		// 아래의 useRemocon() 메소드를 호출하기 위해서는 Remocon  인터페이스 type의 참조값이 필요하다
		// 익명의 Local Inner Class를 이용해서 Remocon type의 참조값을 만들어내서 호출해보자
		
		//인터페이스는 단독 객체 생성 불가능. 생성자가 없기떄문에
		// 익명 클래스를 implement하자
		Remocon r1 = new Remocon() {
			
			@Override
			public void up() {
				System.out.println("볼륨 올림");
			}
			
			@Override
			public void down() {
				System.out.println("볼륨 내림");
			}
		};
			useRemocon(r1);
			
//즉석에서 직접 만들기
//메소드 호출하면서 직접 new해서 만들 수도 있따.
			
			useRemocon(new Remocon() {
				
				@Override
				public void up() {
					System.out.println("온도 올림");
				}
				
				@Override
				public void down() {
			
					System.out.println("온도 내림");
				}
			});
			
		}
	
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
