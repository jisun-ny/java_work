package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		//run하면 쭉 실행의 흐름(Thread, 작업단위)이 아래 코드로 흐른다.
		//원한다면 일정 시간만큼 실행의 흐름을 잡아 놓을 수 있다.
		//How
		//
		System.out.println("main 메소드가 시작 되었습니다");
		//InterruptedException 은 runTimeException을 상속받지 않았기때문에 try-catch 의무
		try {
			/*
			 * 실행의 흐름을 스레드라고 하는데 스래드를 임의로 5초동안 잡아두기
			 * 컴파일 시에 발생하는 Exception(RuntimeException을 상속받지 않은 Exception)
			 * 이 발생하기 때문에 반드시 try-catch 블럭으로 예외 처리를 해야한다.
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 되었습니다");
	}

}
