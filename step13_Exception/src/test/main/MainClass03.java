package test.main;

import java.util.Scanner;

/*
 * java.lang.Object
		java.lang.Throwable
			java.lang.Exception ❤️
				java.lang.RuntimeException ❤️
					java.lang.ArithmeticException ❤️
					
	-Exception은 모든 Exception의 부모 type이다
	
	-예외의 종류는 크게 2가지로 분류할 수 있다
	1. RuntimeException을 상속 받은 예외
		--> try{} catch(){} 블럭으로 감싸는 것은 option이다
		ex) ArithmeticException은 RuntimeException을 상속받았기 떄문에
		try-catch하지 않아도 오류 발생 안함.
		
	2. RuntimeException을 상속 받지 않은 예외
		--> try-catch 블럭으로 감싸는 것 의무.
		
	
	exception의 종류를 모를떈 
	try{} catch(exception e){}
	해버리면 그냥 모든 exception 처리해줌
	
*/

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("나눌 수 입력: ");
		String inputNum1 = scan.nextLine();
		
		System.out.println("나누어 지는 수 입력: ");
		String inputNum2 = scan.nextLine();
		try {
		// NumberFormatException 발생 가능
		int num1 = Integer.parseInt(inputNum1);
		int num2 = Integer.parseInt(inputNum2);
		
		// ArithmeticException 발생 가능
		int result = num2/num1; //몫
		int result2 = num2%num1; //나머지
		
		System.out.println(num2+" 를 "+num1+"으로 나눈 몫: "+result);
		System.out.println(num2+" 를 "+num1+"으로 나눈 나머지: "+result2);
		} catch (Exception e){
			//다형성
			// Exception타입인 e에 new NumberFormatException()도 들어 갈 수 있다.
			//ArithMeticException() 도 들어갈 수 있따.
			// 즉, 모든 예외의 부모인 Exception type으로 오류 처리할 수 있따.
			
			//Exception type은 모든 예외의 부모 type이기 때문에 모든 예외가 여기서 처리 된다.
			System.out.println("예외가 발생했습니다");
			System.out.println("예외 메세지:" + e.getMessage());
		} finally {
			//여기는 예외가 발생을 하건 안하건 반드시 실행이 보장되는 블럭이다.
			//중요한 마무리 작업을 주로 여기서 수행한다.
			System.out.println("중요한 마무리 작업을 합니다.");
		}
		
		System.out.println("main 메소드가 정상 종료 됩니다.");
	}
}
