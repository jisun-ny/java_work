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

public class MainClass09 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream("C:/acorn202304/myFolder/1.jpg");
			fos = new FileOutputStream("C:\\acorn202304\\myFolder\\copied2.jpg");
			//**** 다른방법으로 파일 copy
			//byte알갱이를 읽어낼 배열을 미리 준비하기
			byte[] buffer = new byte[1024]; //1024 = 1kbyte
			//반복문을 돌면서
			while(true) {
				//fis.read();
				//몇 바이트를 읽었는지 갯수가 나옴--> 계속 1024 .... 나오다가 마지막에는 1024가 안될것--> 그러고 더이상 읽을 것이 없으면 -1
				//byte[] 배열을 전달해서 byte 알갱이를 한번에 1024개씩 읽어드린다
				int readedCount = fis.read(buffer);
				if(readedCount == -1) break; //더이상 읽을게 없다면 반복문 탈출
				//byte[] 배열에 저장된 byte알갱이를 0번 인덱스로부터 읽은 갯수만큼만 출력하기
				fos.write(buffer, 0, readedCount); //마지막 바이트 이후의 자투리 숫자(예를들어 52) 이후의 값들은  의미 없는것 52이후의 값들까지 불러오면 오류가생김. 따라서 
				//						52
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


