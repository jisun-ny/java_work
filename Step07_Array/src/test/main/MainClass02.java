package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0 으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums 에 담기 
		int[] nums={0, 0, 0};
		//0번방에 10, 1번방에 20, 2번방에 30 을 저장해 보세요.
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// 0 으로 초기화된 방 500개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums2 에 담기 
		int[] nums2 = new int[500];
			//num2에는 정수가 들어가는 것이 아니고 참조값이 들어가는 거!!
		
		//배열 객체 만들기 new 데이터type[ 방의 갯수 ]
		     			//배열에 저장할 data type
		
		/*
		 *  0 번방에 1
		 *  1 번방에 2
		 *  2 번방에 3
		 *  .
		 *  .
		 *  .
		 *  499 번방에 500 을 저장해 보세요. 
		 */
		
		//배열방의 size만쿰 반복문을 돌면서
		for(int i = 0; i <nums2.length; i++) {
			nums2[i] = i+1;
		}
		//배열의 i번째 방에 i에 1을 더한 값을 대입한다.
	
	}
}
