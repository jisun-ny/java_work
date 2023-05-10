package test.main;

public class MyString extends String {
	// extends String 상속 불가 ( String은 final 클래스임으로..)

	// final을 붙이면 상속 받을 수 없다.
	// 클래스에 붙이면 종단 클래스가 되고
	// 필드나 메소드에 붙이면 상수화 시켜버린다. 값을 바꾸지 못하도록 함. js에서 const 역할
}
