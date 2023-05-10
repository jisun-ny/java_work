package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass11 {
	public static void main(String[] args) {
		List <Integer> nums = new ArrayList <> ();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(10);
		nums.add(20);
		nums.add(30);
		//arrayList는 중복 허용
		
		
		//type확인
		Collection<Integer> num2 = nums;
		//list는 collection을 상속받았응께룽
		
		//HashSet 객체의 생성자에 ArrayList를 전달해서 중복을 제거할 수 있다.
		Set<Integer> set = new HashSet<>(nums);
		
		
		//중복 제거된 Set를 이용해서 ArrayList 객체 새로 생성하기
		//ArrayList를 만들때 이미 중복 제거된 set을 받아와서 ArrayList만들기..
		List<Integer> result = new ArrayList<> (set);
		
		
		
		
	}

}
