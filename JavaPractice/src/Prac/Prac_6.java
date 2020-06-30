package Prac;

//합계와 평균

import java.util.Scanner;

public class Prac_6 {

	public static void main(String[] args) {
		String grade[];
		float sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수: ");
		String line = input.nextLine();
		grade = line.split(",");
		
		
		for (int i = 0; i<10 ; i++) {
			sum += Integer.parseInt(grade[i]);
		}
		
		System.out.println("합계: " + sum);
		System.out.print("평균: " + sum/10);

	}

}
