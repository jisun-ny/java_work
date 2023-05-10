package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass {
	public static void main(String[] args) {
//		//FruitBox 객체를 생성해서 참조값을 box라는 이름의 지역 변수에 담아보세요
//		FruitBox box = new FruitBox();
//		
//		//box에 담긴 참조값을 이용해서 pack() 메소드를 호출해 보세요.
//		box.pack(new Apple());
//		
//		//box에 담긴 참조값을 이용해서 unpack() 메소드를 호출하고 리턴되는 값을 fruit라는 지역 변수에 담아보세요
//		Apple fruit = box.unPack();
//		
//		
//		//여기에 생성한 박스에 Melon을 담을 수 있을까? --> 안됨. 멜론은 애플타입이 아니니꼐룽
//		FruitBox box2 = new FruitBox();
//		box2.pack(new Melon());
		
		// FruitBox를 뜯어고치지 않는 이상 프루트박스에는 애플밖에 못담는다..
		// 우리는 만들어진 유틸리티를 사용하는 입장
		// 유틸리티는 보통 프루트박스를 오렌지를 담고싶은 오렌지를 담을 수 있도록, 멜론을 담고싶으면 멜론을 담을 수 있도록..
		// 나의 용도에 맞겠금 정보를 전달해서 클래스를 사용하 수 있게 해줌
		// but.... HOW?
		
		
		/* 포괄클래스 generic class */
		
		//FruitBox 객체를 생성해서 참조값을 box라는 이름의 지역 변수에 담아보세요
		FruitBox<Apple> box = new FruitBox<Apple>();
		
		//box에 담긴 참조값을 이용해서 pack() 메소드를 호출해 보세요.
		box.pack(new Apple());
		
		//box에 담긴 참조값을 이용해서 unpack() 메소드를 호출하고 리턴되는 값을 fruit라는 지역 변수에 담아보세요
		Apple fruit = box.unPack();
		
		FruitBox<Melon> box2 = new FruitBox<Melon>();
		box2.pack(new Melon());
		Melon fruit2 = box2.unPack();
		
		//Orange
		
		FruitBox<Orange> box3 = new FruitBox<> ();
		// 참조값을 받을때만 제너릭을 표시하고 객체 생성시에는 생략 가능.
		box3.pack(new Orange());
		Orange fruit3 = box3.unPack();
		
		
		
		

	}
}

