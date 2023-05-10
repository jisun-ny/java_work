package test.mypac;

public class Square {
	public int width;
	public int height;
	
	public void area() {
		System.out.println("area: " + (this.width * this.height));
		// new. new, new... 해서 새로운 객체를 만들때마다 고유의  width와 height가 있으므로 this.)
	}

//	public void area() {
//		int area =  this.width * this.height;
//		System.out.println("area: "+area);
//	}

}
