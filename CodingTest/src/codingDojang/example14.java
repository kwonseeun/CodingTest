package codingDojang;

public class example14 {
	boolean solution(String s) {
		boolean answer = true;
		int p_cnt = 0;
		int y_cnt = 0;
		String[] a = s.toLowerCase().split("");
		for (int i = 0; i < a.length; i++) {
			if(a[i].equals("p")) {
				p_cnt++;
			}
			if(a[i].equals("q")) {
				y_cnt++;
			}
		}
		if(p_cnt!=y_cnt) {
			answer = false;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
	}

}
