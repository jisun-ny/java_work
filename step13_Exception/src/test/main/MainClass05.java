package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어할 수 있는 File객체를 생성해서
		 * 참조값을 f라는 지역 변수에 담기
		 */
		File f = new File("C:/acorn202304/myFolder/memo.txt");
	
		//객체 지향 언어의 특징(자바로 프로그래밍 한다는 것은)
		// --> 해당 기능을 가지고 있는 객체를 new 해서 메소드를 활용해서 작업을 한다.
	
	/*
	 * File 객체의 메소드를 활용해서
	 * 실제 memo.txt파일이 존재하지 않으면 파일을 만들고
	 * 존재하면 memo.txt 파일을 삭제하도록 프로그래밍해보세요.
	 * 
	 */
	boolean FileExists = f.exists();
	if (FileExists) {
		f.delete();
		System.out.println("memo.txt 파일을 삭제 했습니다.");
	} else {
		try {
			f.createNewFile();
			System.out.println("memo.txt 파일을 생성 했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	}
}
	
