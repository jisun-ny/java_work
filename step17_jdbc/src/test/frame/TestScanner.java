package test.frame;

import java.util.Random;
import java.util.Scanner;
/*
 * Scanner 객체를 이용해서 구구단의 단수를 입력 받아서 입력한 단에 해당하는 구구단을

보기 처럼 콘솔창에 출력하는

프로그래밍을 해 보세요.

 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 구구단 단수 입력: ");
		String inputNum = scan.nextLine();
		try {
			for(int i = 1; i <10; i++) {
				int num = Integer.parseInt(inputNum);
				System.out.println(num +" x "+ i +" = "+ num*i );
				}
					
					
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	


}
