package Prac;
// 합계 산출 메서드

import java.util.Scanner;

public class Prac_10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("A: ");
		String[] input_A = input.nextLine().split(",");
		int []int_A = new int[input_A.length];
		
		for(int i = 0 ; i < input_A.length ; i++) {
			int_A[i] = Integer.parseInt(input_A[i]);
		}
		
		
		System.out.println("Sum<A> = "+sum(int_A, int_A.length));
		
		System.out.print("B: ");
		String[] input_B = input.nextLine().split(",");
		int []int_B = new int[input_B.length];
		
		for(int i = 0 ; i < input_B.length ; i++) {
			int_B[i] = Integer.parseInt(input_B[i]);
		}
		
		
		System.out.print("Sum<B> = "+sum(int_B, int_B.length));
	}
	
	public static int sum(int []value, int num) {
		int result = 0;
		
		for (int i = 0 ; i < num ; i++) {
			result += value[i];
		}
		
		return result;
		
	}
}
