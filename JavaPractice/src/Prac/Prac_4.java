package Prac;
// 별표 출력

import java.util.Scanner;

public class Prac_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		String star = "*";

//		System.out.println(num);

		for (int i = 1; i <= num; i++) {
			System.out.println(star.repeat(i));
		}

	}

}
