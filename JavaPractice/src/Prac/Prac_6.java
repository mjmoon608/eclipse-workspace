package Prac;

//�հ�� ���

import java.util.Scanner;

public class Prac_6 {

	public static void main(String[] args) {
		String grade[];
		float sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("����: ");
		String line = input.nextLine();
		grade = line.split(",");
		
		
		for (int i = 0; i<10 ; i++) {
			sum += Integer.parseInt(grade[i]);
		}
		
		System.out.println("�հ�: " + sum);
		System.out.print("���: " + sum/10);

	}

}
