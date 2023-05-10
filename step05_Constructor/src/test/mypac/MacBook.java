package test.mypac;

public class MacBook {
	//외부에서 접근 불가하도록 접근 지정자를 private로 해서 필드 3개 선언하기
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//생성자
	public MacBook (Cpu cpu, Memory memory, HardDisk hardDisk) {
		//생성자의 매개 변수에 전달된 값을 필드에 저장하기.
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}
		//이렇게 디폴트 생성자를 따로 정의 안해주면 new MacBook(); 이렇게 객체를 생성할 수 없음.
		//꼭 매개변수의 값들을 전달해줘야함.
}
