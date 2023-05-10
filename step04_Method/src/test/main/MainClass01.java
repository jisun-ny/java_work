package test.main;

import java.io.File;
import java.util.Scanner;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();
		// return type이 void인 메소드 호출
		t.walk(); // --> 얘는 void이기 때문에 ?? a = walk(); 이렇게 대입연산자로 받을 필요가 없다.
		//그냥 호출하고 끝!
		t.getNumber(); // -> 10 // 이 함수를 호출하고 나면 이 위치는 10으로 바뀜.
		// return type이 int인 메소드를 호출하고 리턴되는 값을 a라는 int type 지역 변수에 담기
		int a = t.getNumber();
		
		// return type이 String인 메소드를 호출하고 리턴되는 값을 b라는 String type 지역 변수에 담기
		String b = t.getGreeting(); // -> String type return
		
		//return type이 Airplane인 메소드를 호출하고 return되는 값을 c라는 Airplane type 지역변수에 담기
		Airplane c = t.getPlane(); // 같은 package안에 들어있으니까..
		c.fly();
		
		
		// 위에서 생성한 객체의 setNum() 메서드를 호출해 보세요.
		t.setNum(10);
		// 위에서 생성한 객체의 setName() 메서드를 호출해 보세요.
		t.setName("남지선");
		// 위에서 생성한 객체의 setPlane() 메서드를 호출해 보세요.
		t.setPlane(new Airplane());
		
		
		t.doSomething(10, "남지선", new Airplane());
		
		new File("C:/xxx/xxx.txt").delete();
		// File은 자바에서 자체 제공하는 클래스..
		
		t.send();
		t.send(66);
		t.send("지선");
		t.send(new Airplane());

		
		
		System.out.println("main 메소드가 종료됩니다.");
		
		
	}
}
