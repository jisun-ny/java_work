package test.main;

/*
 * 6. 삼항 연산자 (3항)
 */

public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait = true;
		//isWait이 true이면 "기다려요"가 대입되고 false이면 "기다리지 않아요" 대입된다.
		String result = isWait ? "기다려요" : "기다리지 않아요";
		System.out.println(result);
		
//		int result2 = isWait ? 1 : 0;
		//결과는 1이거나 0이 남으니까 변수는 int에 담아야 함.
		
		//위 삼항 연산자는 아래와 같아 if~ else문과 같은 로직이다.
		
		String result2 = null; //js과 다르게 비워두려면 null입력해야 함
		
		// 메인 메소드 안에서 선언한 변수는 어디에서나 사용가능
		//하지만 if 문 안쪽에서 선언을 해버리면 밖에서 사용할 수 없음! 안에서만 사용가능
		// 블럭 안에서 선언된 변수는 블럭 안에서만 쓸 수 있ㄷ ㅏ ㅋㅎ
		if(isWait) {
			result2 = "기다려요";
		} else {
			result2= "기다리지 않아요";
		}
		System.out.println(result2);
	}

}
