package Prac;

// 대소문자 변환
public class Prac_8 {
	public static void main(String[] args) {
		String str = "Hello, World";
		String result = "";
		char temp;

		for(int i = 0 ; i< str.length() ; i++) {
			temp = str.charAt(i);
			
			if((64 <= temp) && (temp <= 90)) {
				result += str.valueOf(temp).toLowerCase();
			}
			else if((97 <= temp) && (temp<=122)) {
				result += str.valueOf(temp).toUpperCase();
			}
			else {
				result += (char)temp;
			}
		}
		
		System.out.println(result);

	}
}
