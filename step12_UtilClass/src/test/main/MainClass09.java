package test.main;
/*
 * while 문을 활용해서 원하는 횟수만큼 반복하기
 * 
 * -반복 횟수가 명확히 정해져 있으면 for문으로 반복문을 도는 것이 좋다
 * -반복 횟수가 명확히 정해져 있지 않고 반복을 돌아봐야 횟수를 아는 경우 while문으로 반복문을 도는 것이 좋다
 * 
 */

public class MainClass09 {
	public static void main(String[] args) {
		//카운트를 셀 변수를 미리 만들어서 0으로 초기화
		int count = 0;
		//무한 루프 돌다가
		while(true) {
			System.out.println("안녕");
			count++;
			//특정 조건 하에서 무한 루프 빠져나오기
			if(count == 5) {
				break;
			}
		}
		System.out.println("ㅡㅡㅡㅡㅡ");
		
		//i를 0으로 만들고
		int i = 0;
		//i가 5보다 작은 동안에 반복문 수행하기
		while(i<5) {
			//원하는 작업하고
			System.out.println("안녕!");
			//i를 1증가 시킨다
			i++;
			
			/*for문은 i변수가 사라짐.
			 * while은 i변수가 사라지지 않음
			 * for (int i = 0; i<5; i++) {
			 * 	System.out.println("안녕!");
			 * }
			 */
		}
		
	}

}
