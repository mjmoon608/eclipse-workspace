package Prac;
// ���� ���

import java.util.Scanner;

public class Prac_5 {

	public static void main(String[] args) {
		
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Է�: ");
		int num = input.nextInt();
		
		if (num >= 90)
			grade = "A";
		else if (num >= 80)
			grade = "B";
		else if (num >= 70)
			grade = "C";
		else
			grade = "F";
		
		System.out.println("���� : " + grade);
		
		
	}

}
