package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		//1byte 처리 스트림
		InputStream is = System.in;
		//2byte 처리 스트림(한글 처리 가능) --> isr.read() 2바이트는 256*256잉꼐룽
		InputStreamReader isr = new InputStreamReader(is);
		
		System.out.println("입력:");
		try {
			//키보드로 입력한 키의 code값 읽어오기
			int code = isr.read();
			System.out.println("code 값:"+code);
			//code값에 대응하는 문자 얻어내기--> character type으로 캐스팅
			char ch = (char)code;
			System.out.println("char:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
