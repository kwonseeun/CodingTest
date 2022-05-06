package algorythm01;

public class example09 {
	public int solution(String s) {
		int answer = 0;
		for (char x: s.toCharArray()) {
			if (x >= 48 && x<=57) 
				answer=answer*10+(x-48); 
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
