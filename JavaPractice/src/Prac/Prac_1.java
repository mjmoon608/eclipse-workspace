package Prac;
// ���� ȭ�� ��ȯ
import java.util.Scanner;

public class Prac_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(input);
		
		float subC;
		float hawC;
		
		System.out.print("���� �µ���?");
		subC = input.nextFloat();
		hawC = (subC * 9/5) + 32;
		
		System.out.println("����: " + subC);
		System.out.println("ȭ��: " + hawC);
		
		
		input.close();
	}

}
