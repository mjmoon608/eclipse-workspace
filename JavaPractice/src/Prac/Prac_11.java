package Prac;
// 사칙연산 메서트
public class Prac_11 {

	public static void main(String[] args) {

		System.out.println(plus(5,6));
		System.out.println(minus(5,6));
		System.out.println(mul(5,6));
		System.out.println(dev(5,6));

	}
	
	public static int plus(int a, int b) {
		int result = 0;
		
		result = a + b;
		
		return result;
	}
	public static int minus(int a, int b) {
		int result = 0;
		
		result = a - b;
		
		return result;
	}
	public static int mul(int a, int b) {
		int result = 0;
		
		result = a * b;
		
		return result;
	}
	public static int dev(int a, int b) {
		int result = 0;
		
		result = a / b;
		
		return result;
	}

}
