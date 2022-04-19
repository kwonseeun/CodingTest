package algorythm01;

public class example07 {
	public String solution(String str) {
		String answer = "YES";
		int len=str.length();
		for (int i = 0; i < len/2; i++) 
			if (str.charAt(i) != str.charAt(len-i-1)) return "NO";
			
		}
	
	public static void main(String[] args) {
		example07 ex = new example07();
		
	}

}
