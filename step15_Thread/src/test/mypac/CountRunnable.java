package test.mypac;
/*
 * 새로운 스레드를 만드는 방법2
 * 
 * 1. Runnable 인터페이스를 구현한 클래스를 정의한다.
 * 2. run() 메소드를 강제 오버라이드 한다.
 * 3. Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달한다.
 * 4. Thread 클ㄹ래스로 만든 객체으 start() 메소드를 호출해서 스레드를 시작 시킨다.
 */
public class CountRunnable implements Runnable {

	@Override
	public void run() {
		//카운트 값을 저장할 지역 변수 만들고 초기 값 대입
		int count = 10;
		//반복문 돌면서 
		while(true) {
			System.out.println("현재 count:"+count);
			if(count == 0) {
				//만일 카운트가 0이면
				break; //반복문 탈출
			}
			//1초마다 
			try{
				Thread.sleep(10000);
			} catch (InterruptedException el) {
				el.printStackTrace();
			}
			//카운트를 1씩 감소시키고
			count--;
			}
		}
		
	// new Thread( new CountRunnable) ) 
	}

