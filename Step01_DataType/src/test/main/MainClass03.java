package test.main;
/*
 * Java 기본 데이터 type
 * 
 * 2. 논리형
 * 
 * - true, false 두 가지 값 중 하나이다.
 * - true, false를 직접 쓰거나 비교연산 혹은 논리 연산의 결과로 얻어낼 수 있다.
 * - 참과 거짓을 나타내는 데이터 type
 */

public class MainClass03 {
	public static void main(String[] args) {
		boolean isRun = true;
		
		if(isRun) {
			System.out.println("달려요");
		}
		
		// 비교연산의 결과로 얻어진 boolean 값 담기
		boolean isGreater = 10 > 1;
		// 논리연산의 결과로 얻어진 boolean 값 담기
		boolean result = true || false;
		
		// 한번 선언한 변수는 중복 선언 안됨! ❌
		// boolean result = false;
		result = false; // 변수에 다른 값을 대입할 수 있다. (동일한 type인 경우)
		// 다른 type 값은 변수에 담을 수 없다.
		// result = 10; ❌
	}

}
