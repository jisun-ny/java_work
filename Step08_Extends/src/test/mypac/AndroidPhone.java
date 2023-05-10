package test.mypac;

public class AndroidPhone extends HandPhone {
	//생성자
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출됨");
	}
	
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	public void showPlatform() {
		System.out.println("Android 운영체제 입니다.");
	}
	
	//ctrl+space누르면 override할 수 있는 목록이 뜸
	
	//아래의 @Override는 해당 메소드가 재 정의 되었다고 단순히 표시하는
	//용도이며 특별한 기능을 가지지 않기 때문에 지워도 이상 없음. 하지만 굳이..?
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
//		super.takePicture();
		// 얘는 필요 있을때도 있고 없을 떄도 잇다..
		// 원래 본 부모 객체의 메소드를 호출하는 것
		
		System.out.println("1000만 화소의 사진을 찍어요!");
		//이렇게 오버라이드할 내용을 정의해준다!
	}
	
}


