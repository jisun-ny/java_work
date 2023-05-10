package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		//Drill객체를 즉석에서 생성해서 전달~
		//익명 클래스 메소드를 이용해서 hole 메소드를 완성 시켜서 전달~
		
		useDrill(new Drill() {
			//Drill type의 참조값
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요");
				
			}
		});
		
		//윗 코딩을 간략하게 표현하면(줄인표현) // 추상메소드가 오직 1개인 인터페이스에 한해서!(오버라이드할 메소드가 하나일 때)
		useDrill( () -> {
			System.out.println("천장에 구멍을 뚫어요!");
		} );
		
	}
	
	public static void useDrill(Drill d) {
		
		d.hole();
		d.hole();
	}
	
	//useDrill메소드에서 사용할 메소드 하나를 전달한 느낌??
	//자바는 메소드가 단독으로 존재할 수 없으니까
	//객체로 포장해서 전달.. ㅋㅎ..
	//js에서 함수에서 쓰일 함수를 전달하는 느낌...? 
	
	/*
	 * in javascript
	 * 
	 * useFuc ( () => {함수가 호출되는 시점에 실행됐음 좋겠는 함수} );
	 * 이렇게 함수를 전달
	 * 
	 * function useFunc (f) {
	 * 		f();
	 * };
	 * 
	 * ex) addEventListener("mousedown", (e) => {})
	 * 		이벤트리스너 함수에 콜백함수 전달~
	 * 
	 * 
	 */
}
