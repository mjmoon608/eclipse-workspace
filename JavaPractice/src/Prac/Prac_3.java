package Prac;

// 구구단 3단
public class Prac_3 {

	public static void main(String[] args) {

//		for (int i = 1; i <=9 ; i++) {
//			System.out.println("3 * " + i + " = " + (3*i));
//		}

		for (int i = 2; i <= 9; i++) {
			System.out.println("==" + i + "단==");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}

	}

}
