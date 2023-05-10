package test.main;

import java.util.HashMap;

import test.mypac.Car;
/*
 * java에서 어떤 데이터를 key : value의 쌍으로 관리하고 싶으면
 * HashMap 객체를 사용한다.
 * 
 * key의 generic도 마움대로 지정할수 있지만 보통 String type으로 한다
 * 
 * value의 generic은 그때 그때 다르지만 value가 여러가지 type이면 
 * 
 * Object로 한다.
 */


public class MainClass06 {
	public static void main(String[] args) {
		HashMap<String, Object> map1 = new HashMap<>();
//		    key의 generic, value의 generic
		// 문자열을 키값으로 해서 원하는 어떤 type의 value도 저장할 수 있다. --> 자바의 모든 데이터는 object type이기 때문에
		map1.put("num", 1); //Integer
		map1.put("name", "김구라"); //String
		map1.put("isMan", true); //boolean
		map1.put("car", new Car("소나타")); //Car type 담기
		//key, value 쌍으로 데이터를 담을 땐 put method을 이용하여 담는다
		// 불러오려면 get // Object type을 returng해줌 왜냐하면 value 데이터 타입을 오브젝트로 받았기 때문에!! 만약에 인테거 타입으로 받으면 리턴타입도 인테거!
		// -> 사용하려면 캐스팅하자!
		// 밸류를 오브젝트로 받으면 아무 타입이나 다 받을 수 있는 장점이 있지만 get 해서 데이터 값을 불러왔을 때 캐스팅 해줘야하는 번거로움이 있다.
		
	    int num = (int)map1.get("num");
	    String name = (String)map1.get("name");
	    boolean isMan = (boolean)map1.get("isMan");
	    Car car = (Car)map1.get("car");
	      
	    //동일한 key 값으로 다시 담으면 수정
	    map1.put("name", "에이콘");
	    
	    
	    //특정 key 값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false 리턴
	    map1.remove("isMan");
	      //모두 삭제 
	    map1.clear();

		
	}

}
