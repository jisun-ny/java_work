package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * object
		 * ↑
		 * AbstractCollection
		 * ↑
		 * AbstractList
		 * ↑
		 * ArrayLst
		 * 
		 * type a = new ArrayList();
		 * ----
		 * type을
		 * object로 받으면 하위 클래스의 내용을 다 쓸 수 있다.
		 * interface로도 받을 수 있다.
		 * 우리가 주로 쓰는 메소드는 List인터페이스에 많이 들어있따..
		 * 
		 * 따라서 ArrayList 타입으로 받는것보다
		 * List<> type (인터페이스 타입)으로 받는것이 깔끔하다
		 * 
		 */
		List<String> greets = new ArrayList<>();
		// ArrayLis
		// t 객체를 생성해서 참조값을 List 인터페이스 type 변수에 대입하기
		greets.add("Hello");
		greets.add("Hi");
		greets.add("Good night");
		
		//Consumer 인터페이스 type의 참조값 얻어내기
		Consumer<String> con = new Consumer<> () {

			@Override
			public void accept(String t) {
				System.out.println("오잉 : " + t);
				
			}
			
		};
		
		greets.forEach(con);
		// 인터페이스를 매개변수로 전달하는 방법 --> 인터페이스를 상속받아 완성한 클래스를 전달한다.
		
		System.out.println("----------------------------------------------------------------");
		
		
		greets.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("오잉 : " + t);
			
			}
			
		});
		
		System.out.println("----------------------------------------------------------------");
		
		
		greets.forEach((t) -> {
			System.out.println("오잉 : " + t);
		});
		
		/* in JavaScript
		 * let greets = ["hi", "hello", "bye"];
		 * greets.forEach((t) => {
		 * 	console.log("오잉 : " + t
		 * });
		 * 
		 *js와 java가 비슷하게 생김! 헷갈리지 말쟈~ 화살표 모양 다름!
		 */
		
		
	}
}
