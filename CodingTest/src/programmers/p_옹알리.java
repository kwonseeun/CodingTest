package programmers;

public class p_옹알리 {
	 public int solution(String[] babbling) {
	        int answer = 0;
	        for(int i=0; i< babbling.length; i++){
	             babbling[i] = babbling[i].replaceFirst("aya", "0");
	             babbling[i] = babbling[i].replaceFirst("ye", "0");
	             babbling[i] = babbling[i].replaceFirst("woo", "0");
	             babbling[i] = babbling[i].replaceFirst("ma", "0");
//	    처음 부분을 포함한걸 전부 없에라 replace 할경우 다 없어지기 때문에 first사용
	            babbling[i] = babbling[i].replace("0", ""); 
	                  // 하나 없엔게 동일하게 하나가 더 남아있다면 그건 조합한거기 때문에 ++
	              if(babbling[i].equals("")) answer++;
	                
	        }
	                   
	        return answer;
	    }
}
