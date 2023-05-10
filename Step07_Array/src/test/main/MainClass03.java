package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// 1.String type을 담을 수 있는 방 3개짜리 
		//빈 배열객체를 만들어서 참조값을 지역변수 names에 담기
		
		String[] names = new String[3];
		//배열을 만드는 방법
		//1.중괄호 열고 닫고 String[] names = {null, null, null};
		//null은 참조값의 기본값...
		//2. new 배열에 저장할 data type [방의 크기]
		
		// 2. 3개의 방에 순서대로 친구의 이름을 담아 보세요
		names[0] = "뽀로로";
		names[1] = "루피";
		names[2] = "에디";
		
		//3. 배열에 들어 있는 친구의 이름을 하나씩 순서대로 콘솔창에 출력해보세요.
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	
}
}
