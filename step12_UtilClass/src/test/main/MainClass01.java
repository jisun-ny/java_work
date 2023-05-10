package test.main;

import java.util.ArrayList;

/*
 * java에서 배열은 크기를 조절할 수 없는 고정 배열이다
 * 
 * 따라서 동적으로 item을 추가하고 삭제하는 작업을 하려면 일반 배열은 사용할 수 없다.
 * 
 * 그래서 해당 작업을 하려면 ArrayList라는 객체를 배열 대용으로 사용하면 된다.
 */

/*
 * arrayList에는 기본 데이터 타입은 담을 수 없다. --> 객체로 포장해서 담아야함!(객체형)
 * 참조 데이터 타입만 담을 수 있다. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		
		// String type을 저장할 수 있는 ArrayList 객체생성해서 참조값을 names에 담아보세용
		ArrayList<String> names = new ArrayList<>();
		
		//"김구라", "해골", "원숭이" 3개의 String type을 저장해보세요.
		names.add("김구라");
		//add는 불리언타입을 리턴함. 만약 필요하다면 boolean a = names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		//0번 방의 아이템을 불러와서 item이라는 변수에 담아보세요
		String item = names.get(0);
		
		//1번방의 아이템을 삭제하려면?
		names.remove(1);
		
		//0번방에 "에이콘"을 넣고 싶으면?
		names.add(0, "에이콘");
		
		//저장된 아이템의 갯수(size)를 size라는 지역 변수에 담아보세요
		int size = names.size();
		
		System.out.println(names);
		//저장된 모든 아이템 전체 삭제
		names.clear();
		System.out.println(names);
	}
				
}
