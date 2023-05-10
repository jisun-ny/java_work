package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		// add1을 줄여서 add2로 표현할 수 있따.
		// add2를 더 줄여서 add로 표현
		Calc add1 = new Calc() {

			@Override
			public double execute(double num1, double num2) {
				return num1 + num2;
			}
		};
		
		Calc add2 = (num1, num2) -> {
			return num1 + num2;
		};
		
		Calc add = (num1, num2) -> num1 + num2; //중괄호 없애면 return 생략 가능
		
		Calc sub = (num1, num2) -> num1 - num2;
		Calc mul = (num1, num2) -> num1 * num2;
		
		double result1 = add.execute(10, 20);
		double result2 = sub.execute(10, 20);
		double result3 = mul.execute(10, 20);
		System.out.println(result3);
	}

}
