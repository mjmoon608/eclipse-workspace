package Prac;
// 시저암호
public class Prac_9 {

	public static void main(String[] args) {
		String str = "Hello World";
		String test = solution(str, 3);
		
		System.out.println(test);

	}

	public static String solution(String s, int n) {
		String answer = "";
		int len = s.length();
		char alpha;
		char start;
		
		for (int i = 0; i < len; i++) {
			alpha = s.charAt(i);
			if(alpha != ' ') {
				start = Character.isLowerCase(alpha)? 'a':'A';
				alpha = (char)(start + (alpha+n-start)%26);
			}

			answer += alpha;
		}

		return answer;
	}

}
