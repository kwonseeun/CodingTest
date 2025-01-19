package kakao;

public class K_신규아이디추천 {
	public static void main(String[] args) {
		String new_id = "...!_@BaT#*..y.abcdefghijkl.m.";
		System.out.println(solution(new_id));
	}
	
	public static String solution(String new_id) {
		String answer = "";
		
		new_id = new_id.toLowerCase() // 1번
                 .replaceAll("[^\\w-\\.]", "") // 2번
                 .replaceAll("[\\.]{2,}", ".") // 3번
                 .replaceAll("^\\.|\\.$", ""); // 4번
		
		if(new_id.length()==0) new_id = "a"; // 5번
		else if (new_id.length()>=16){ // 6번
			new_id = new_id.substring(0,16);
			new_id = new_id.replaceAll("\\.$", ""); 
		}
		
		while(new_id.length()<3) { // 7번
			new_id = new_id + new_id.substring(new_id.length()-1);
		}
		
	    return new_id;
	
	}
}
