package test.main;

import java.util.Scanner;


public class MainClass05 {
	public static void main(String[] args) {
		//개행기호를 출력하지 않고 콘솔창에 문자열 출력하기 .print() 메소드를 활용하면 딘다.
		//옆에다가 바로 입력할 수 있음.
		System.out.print("문자열 입력: ");
		//키보드로부터 입력 받을 수 있는 기능을 가진 객체 생성
		Scanner scan = new Scanner(System.in);
		//키보드에 관련된 객체가 이미 저장되어있음. System의 in이라는 필드안에 있는 참조값 이용
		String str = scan.nextLine();
		//입력받은 문장열을 콘솔에 출력해 보기
		System.out.println(str);
		System.out.println("main 메소드가 종료 되었습니다.");
	}

}


//콘솔창에서 스트링객체 얻어내려면 Scanner 객체 사용
//랜덤한 숫자를 얻어내려면 Random객체 사용 
// 정수를 배열에 담고싶으면 스트링 배열 사용