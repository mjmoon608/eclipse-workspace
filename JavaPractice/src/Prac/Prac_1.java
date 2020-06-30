package Prac;
// ¼·¾¾ È­¾¾ º¯È¯
import java.util.Scanner;

public class Prac_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(input);
		
		float subC;
		float hawC;
		
		System.out.print("¼·¾¾ ¿Âµµ´Â?");
		subC = input.nextFloat();
		hawC = (subC * 9/5) + 32;
		
		System.out.println("¼·¾¾: " + subC);
		System.out.println("È­¾¾: " + hawC);
		
		
		input.close();
	}

}
