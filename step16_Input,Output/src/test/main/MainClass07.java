package test.main;

import java.io.File;
import java.io.FileWriter;

/*
 * 원하는 제목과 내용을 가지고 있는 파일 만들기
 * File 객체, FileWriter 객체 이용
 */

public class MainClass07 {
	public static void main(String[] args) {
		//파일에 저장할 sample 문자열
		String msg = "안녕하세요";
		
		File f = new File("C:\\acorn202304\\myFolder/diary.txt");
		try {
			//만일 파일이 존재하지 않는다면
		if (! f.exists()) {
			//파일을 만든다.
			f.createNewFile();
			System.out.println("diary.txt 파일을 만들었습니다.");
		}
		//파일에다가 문자열을 출력할 수 있는 객체의 참조값 얻어내기
		// new FileWriter( File 객체, append모드 여부) 
		FileWriter fw=new FileWriter(f, true);
		// 어펜드모드가 트루면 덮어쓰기 xx 계속 생김. 디폴트값은 false임
//		FileWriter fw = new FileWriter(f);
		fw.write(msg); //출력할 준비
		fw.flush(); //출력
		fw.close(); //마무리
		System.out.println("diary.txt 파일에 문자열을 기록했습니다.");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
