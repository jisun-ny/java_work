package test.main;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass02 {
	public static void main(String[] args) {
		Test t = new Test();
		
		t.send();
		//값을 즉석에서 만들어서 전달
		t.send(010);
		t.send("하이");
		t.send(new Airplane());
		// 메소드가 같은이름으로 종류가 많다면 그냥 내가 전달해주고 싶은걸 괄호안에 넣으면 알아서 전달해줌.
		
		// 참조되는 값을 전달할 수도 있다.
		int a = 999;
		t.send(a);
		
		String b = "하이이";
		t.send(b);
		
		Airplane c = new Airplane();
		t.send(c);
	
	}

}
