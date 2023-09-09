package kakao;

public class K_올바른괄호 {
	 boolean solution(String s) {
	        boolean answer = true;
	        int a = 0;
	        if(s.charAt(0) == ')') return false;
	        else if(s.charAt(s.length()-1) =='(') return false;
	        
	        for(int i=0; i < s.length(); i++){
	            if(s.charAt(i) == '(') a++;
	            else if(s.charAt(i) == ')') a--;
	            
	            if(a < 0) return false;
	        }
	        //test
	        return a == 0 ? true : false;
	    }
}
