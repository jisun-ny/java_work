package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		//학습을 위해 PrintStream 객체를 부모 type OutputStream으로 받아보기
		//OutputStream 1byte 처리 스트림이다.
		OutputStream os = ps;
		
		//2byte 처리 스트림
		OutputStreamWriter osw = new OutputStreamWriter(os);
		try {
			osw.write(48148);
			osw.write(48372);
			osw.write(44032);
			osw.write("아니야");
			osw.flush(); //.flush()를 호출하지 않으면 출력되지 않는다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
