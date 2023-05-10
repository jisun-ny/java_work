package test.mypac;

/*
 * 클래스 안에서 사용하는 특정 type을 고정하지 않고
 * 클래스를 사용하는 시점에 동적으로 type을 정할 수 있게 할 수 있다.
 * 
 * -아래 선언한 T는 마음대로 스펠링이나 단어를 정할 수 있다.
 * 	보통 type이라는 의미에서 T라고 많이 정한다
 * -T를 포괄클래스라고 한다.
 */

//가상의 과일 박스
public class FruitBox<T> {
	
	//필드
	private T item;
	//	apple
	
	// 과일을 포장하는 메소드
	public void pack(T item) {
		this.item = item;
	}
	
	// 과일을 리턴하는 메소드
	public T unPack() {
		return item;
	}
	

	
	// type이 고정이 아니고 동적으로 지정되도록 하기
	// FruitBox<T> 라고 적고
	// Apple 자리에 T 넣어주기
	// 굳이 T일 필요 없음! 같은 문자 넣어주면 됨.
	// Generic Class 포괄 클래스
	
	// 여러개의 제너릭을 지정할 수도 있따.
	// FruitBox<T, T2> 이런식으로..
	
}
