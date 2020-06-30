package Prac;
// 국영수 합계와 평균
public class Prac_7 {

	public static void main(String[] args) {
//		int st1[] = {90, 80, 80};
//		int st2[] = {85, 85, 95};
//		int st3[] = {95, 70, 75};
//		int st4[] = {80, 80, 90};
//		int st5[] = {90, 75, 80};
		
		int st[][] = {
				{90,80,80},
				{85,85,95},
				{85,70,75},
				{80,80,90},
				{90,75,80}
				};
		
		int sum = 0;
		
		float aver = 0;
		
		for (int i = 0 ; i<5 ; i++) {
			System.out.print("ID="+i);
			for (int j = 0 ; j<3 ; j++) {
				sum += st[i][j];
			}
			System.out.print("합계="+sum);
			aver = sum/3;
			System.out.println("평균="+aver);
			sum=0;
		}
		

	}

}
