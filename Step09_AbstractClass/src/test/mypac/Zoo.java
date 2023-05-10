package test.mypac;

public class Zoo {
// 클래스 안에 정의할 수 있는 것
// 1. 생성자 2. 필드 3. 메소드 (static & non-static)
// 4. 클래스 (클래스 안에 클래스 정의 가능) --> 내부 클래스( inner class)
	
	
		// inner class 내부 클래스
		public class Monkey {
			public void say() {
				System.out.println("나는 원숭이야");
			}
		}
			
		public class Tiger {
			public void say() {
				System.out.println("나는 호랑이야야");
			}
		}
		
		//메소드
		public Monkey getMonkey() {
			//내부 클래스로 객체를 생성해서 리턴해주기
			return new Monkey();
		}
		
		public Tiger getTiger() {
			return new Tiger();
		}
	}

	

