package kakao;

public class K_N진수_게임 {
	public static String solution(int n, int t, int m, int p) {
	    String retVal = "";
	    
	    int curTurn = 0;
	    int curNum = 0;
	    String strNum = "";
	    
	    while(retVal.length() < t) {
	        strNum = conversion(n, curNum++); // 진수변환 결과 리턴
	        for(char c : strNum.toCharArray()) {
	            curTurn++;
	            if(curTurn == p) {
	                retVal += c;
	                if(retVal.length() == t) {
	                    break;
	                }
	            }   
	            if(curTurn == m) {
	                curTurn = 0;
	            }
	        }
	    }
	    
	    return retVal;
	}
	public static String conversion(int n, int num) {
	    String retVal = "";
	    if(num == 0) retVal = "0";
	    while(num != 0) {
	        retVal = (num % n < 10 ? Integer.toString(num % n) : Character.toString((char) (num % n + 55))) + retVal;
	        if(num / n == 0) retVal = num + retVal; 
	        num = num / n;
	    }
	    return retVal;
	}
}
