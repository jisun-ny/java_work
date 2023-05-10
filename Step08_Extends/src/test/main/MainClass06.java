package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1 = new HandPhone();
		
		// 엄마! 나도 AndroidPhone 갖고 싶오오 으아아아앙~!
		AndroidPhone p2 = (AndroidPhone)p1;
		
		//진짜? 왕 나도 인터넷 된다 이제~~
		p2.doInternet();
		// 는 안됨. 에러 남.
		// 원래 처음부터 구형 핸드폰인데 
		// 캐스팅만 안드로이드로했다고 인터넷이 될거라고 생각하는게
		// 말이 안됨.. ㅋ 양심이 잇찌..
		// Exception
		// 라인 12번에서 에러가 나서 밑으로 쭉 실행 흐름이 안나타나고 
		// 실행 흐름이 다른 곳으로 순서가 튀어버림
		// 즉, class casting이 무조건 되는 것은 아니다!
		// 만약 line9에서
		// HandPhone p1 = new AndroidPhone();
		// 안드로이드 객체를 핸드폰 타입으로 받은거였으면 됬겠지~
		// 근데 아니니까 안됨.
		
	}

}
