package test.mypac;

public class Airplane {
	public void fly() {
		System.out.println("날아갑니다잉");
	}
	
	// Airplane type을 return하려면?
	public Airplane getPlane() {
		return new Airplane();
//		
//		 Airplane plane = new Airplane();
//		 return plane;
	}
	
	
}
