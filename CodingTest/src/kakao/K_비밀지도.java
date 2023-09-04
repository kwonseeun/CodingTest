package kakao;

public class K_비밀지도 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String retStr[] = new String[n]	;	
		
		for(int i=0; i < n; i++) {

			String result = "";
			String str1 = change10to2(arr1[i],n);
			String str2 = change10to2(arr2[i],n);
			
			
			for(int j=0; j < n; j++) {
				if(str1.charAt(j) == '1' || str2.charAt(j) == '1') {
					result += "#";
				}else {
					result += " ";
				}
			}
			retStr[i] = result;
		}
		return retStr;
    }
    public static String change10to2(int n,int length) {
	    String s = "";
	    while (n > 0)
	    {
	        s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
	        n = n / 2;
	    }
	    int tmp = length-s.length();
	    for(int i=0; i <tmp ; i++) {
	    	s = "0" + s;
	    }
	    return s;
	}
}
