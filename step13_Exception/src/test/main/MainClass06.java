package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass06 {
	public static void main(String[] args) {
		//우연한 시점에 예외를 발생시키는 것으로 가정
		
		Random ran = new Random();
		//0~4 사이의 랜덤한 정수 얻어내기
		int ranNum = ran.nextInt(5);
		//우연히 가장 큰 수가 나오면 WowException을 발생시키기
		if(ranNum ==4) {
			//throw 예약어와 함께 예외 객체를 생성하면 예외가 발생한다.
			throw new WowException("놀랍네이거 최대 숫자가 나와버렸넹");
			// 우리가 처리하기 귀찮아
			// throw 해버린 경우 Java Virtual Machine에서 해당 예외를 처리.
		}
		System.out.println("main 메소드가 종료됩니다.");
	}

}
