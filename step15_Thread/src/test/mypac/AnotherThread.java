package test.mypac;
/*
 * 새로운 스레드를 만드는 방법
 * 
 * 1. Thread 클래스를 상속 받은 클래스를 정의한다.
 * 2. run() 메소드를 오버라이드한다
 * 3. run() 메소드 안에서 새로운 스레드에서 해야 할 작업을 코딩한다
 * 4. 만든 클래스로 객체를 생성하고 해당 객체의 start() 메소드를 호출하면 새로운 스레드가 시작된다.
 */

//1
public class AnotherThread extends Thread{
	//2
	@Override
	public void run() {
		//3 --> 독립적으로 실행하고 싶은 작업을 여기에 적는다
		try{
			Thread.sleep(10000);
		} catch (InterruptedException el) {
			el.printStackTrace();
		}
		System.out.println("작업이 끝났습니다.");
	}
	//4
	//run method안에 있는 작업을 새로운 스레드에서 하고싶으면 
	//new AnotherTread().start();
	//호출한다.
	//new AnotherTread().run(); 하면 새로운 스레드에서 하는게 아님!! 그냥 원래 스레드에서 하는거임 ㅜ ㅅ ㅜ
}