package test.main;
/*
 * 파일 copy연습
 * 
 * 파일을 입력 출력할때는 바이트 알갱이들의 이동
 * FileInputStream / FileOutputStream
 * (버퍼리더 뭐시기 이런것들은 문자열을 이동시킬때)
 * 
 * 예를 들어 1.jpg는 약 10만 바이트
 * 알갱이들을 하나씩 옮기기 어려우니까
 * 효율성을 위해 
 * 배열에 바이트를 넣어서 이동.
 */

//파일 다운로드 네트워크 ---> 컴퓨터
//				byte

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass08 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream("C:/acorn202304/myFolder/1.jpg");
			fos = new FileOutputStream("C:\\acorn202304\\myFolder\\copied.jpg");
			while(true) {
				//1 byte씩 읽어드리고
				int readedByte = fis.read();
				System.out.println(readedByte);
				//더이상 읽을게 없다면 반복문 탈출
				if(readedByte== -1) break;
				//읽은 1 byte를 출력하기
				fos.write(readedByte);
				fos.flush();
				
			}
			System.out.println("파일을 copy했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			}catch(Exception e ) {}
		}
		}
				
	}


