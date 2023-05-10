package test.main;

import test.mypac.Square;

/*
 * test.mypac 패키지에 클래스를 하나 만들어 보세요
 * 
 * - 사각형의 폭(width), 높이(height)를 필드에 저장할 수 있어야 합니다.
 * - 필드에 저장된 폭과 높이를 이용해서 사각형의 넓이를 콘솔창에 출력하는 메소드을 가직 있어야 합니다.
 * - 필드와 메소드는 모두 non static으로 만드세요
 * - 클래스명, 필드명, 메소드명은 여러분이 마음대로 정해보세용
 */
public class MainClass10 {
	public static void main(String[] args) {
		//클래스를 만들었다면 여기에 코드를 추가해서 테스트를 해보세요.
		Square size = new Square();
		size.height = 20;
		size.width = 50;
		size.area();
		
		Square size2 = new Square();
		size2.height = 10;
		size2.width = 5;
		size2.area();
		
		
	}

}
