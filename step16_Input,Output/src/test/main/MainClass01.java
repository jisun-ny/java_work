package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 * 입력, 출력 (input, output)
 * 
 * -어떤 대상으로부터 데이터를 메모리로 읽어 들이는 것을 입력이라고한다
 * -프로그래밍 언어의 관점에서 메모리라는 것은 변수 or 필드 or 객체로 생각하면 편하다
 * -데이터는 2진수로 이루어져있지만 2진수 8게의 묶음인 1byte 단위로 생각하면 편하다
 * -1byte는 총 256가지의 값을 표현할수 있따.
 * -1byte를 10진수로 환산하면 0~255 사이의 숫자중에 하나이다.
 * 영어 특수문자 기호 이런것들은 1바이트로 되는데 한글, 일본어 같은 것들은 2바이트 섞이면 알파벳도 2바이트 (utf-8)--> 텍스트파일이 조금 커지는 경향이 있음
 * -입력과 출력을 통해서 이동하는 데이터는  byte(byte알갱이) 하나 하나가 이동한다고 생각하면 된다.
 */

/*
 * 입력 대상 could be.. keyboard, file, network ...
 * 이거를 메모리로 읽어들인 다음
 * 출력 대상 could be.. console, file(키보드로 입력한걸 텍스트파일로 저장..), network(파일전송..)...
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 키보드와 연결된 InputStream type의 참조값을 kbd라는 지역변수에 담기
		// InputStream 객체는 1byte 단위 처리 스트림이다.
		// 영문자 대소문자, 숫자, 특수문자만 처리할 수 있다
		// 한글 처리 불가
		System.out.println("main 메소드가 시작됩니다");
		InputStream kbd = System.in;
		try {
			System.out.print("입력:");
			//키보드로 입력한 키의 code값 읽어오기
			int code = kbd.read();
			System.out.println("code 값:"+code);
			//code값에 대응하는 문자 얻어내기--> character type으로 캐스팅
			char ch = (char)code;
			System.out.println("ch:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다");
	}

}
