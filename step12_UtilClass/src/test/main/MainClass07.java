package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass07 {
	
	
	public static void main(String[] args) {
		/*
		 * 세명의 회원정보(번호, 이름, 주소)를 HashMap 객체에 각각 담아서
		 * ArrayList 객체에 누적 시켜 보세요
		 * 
		 * 반복문 돌면서 ArrayList 객체에 누적된 회원정보를 콘솔창에 순서대로 출력해보세요
		 * 
		 * (HashMap 객체 3개, ArrayList 객체 1개가 생성되어야 함
		 * 
		 * ArrayList 객체 안에 HashMap을 담을 예정이니
		 * 
		 * List<HashMap<String, Object>> type이 필요합니다.
		 */
		
		List< HashMap<String, Object>> list = new ArrayList<>();
		
		HashMap <String, Object> mem1 = new HashMap<>();
		//객체생성은 class로 하고 Map type으로 받아도 상관없다.
		mem1.put("num", 1);
		mem1.put("name", "남지선");
		mem1.put("addr", "시흥시");
		
		HashMap<String, Object> mem2 = new HashMap<>();
		mem2.put("num", 2);
		mem2.put("name", "김구라");
		mem2.put("addr", "노량진");
		
		HashMap<String, Object> mem3 = new HashMap<>();
		mem3.put("num", 3);
		mem3.put("name", "해골");
		mem3.put("addr", "행신동");
				
		list.add(mem1);
		list.add(mem2);
		list.add(mem3);
		
		for(HashMap<String,Object> tmp: list) {
			//번호
			int num=(int)tmp.get("num");
			//이름
			String name = (String)tmp.get("name");
			//주소
			String addr = (String)tmp.get("addr");
			
			System.out.println("num: "+num+", name: "+name+", addr: "+addr);
			
		}
		
		//결국 위의 코딩은 javascript에서의 
		// [{}, {}, {}] 형태
		// ArrayList []  HashMap {} 
		
		//MainClass 05와 비교했을 때 
		// 05는 클래스를 각각 만들어야하는 것과 달리
		// HashMap은 그냥 import 해서 사용하면 됨.
		// 대신 해쉬맵을 사용하면 어떤 밸류에다가 어떤 키값을 넣엇는지 데이터 타입을 잘 기억하고 있다가 써야함
		
		
		
		
	}

}
