package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		//사용하지 않고 버려버리기
		new Student();
		
		//객체 만들어서 바로 한 번 사용하고 버려버리기 (일회용)
		new Student().study();
		
		//객체를 생성해서 변수에 담아서 --> 여러번 사용
		Student s1 = new Student();
		s1.study();
		s1.study();
		
		//객체는 총 3개 만들어짐 new가 세개니께룽
	}

}
