package kakao;

import java.util.HashMap;
import java.util.LinkedList;

public class K_오픈채팅방 {
	 public String[] solution(String[] record) {
	        
	        HashMap<String,String> map = new HashMap<String,String>();
	        
	        LinkedList<String[]> tmp = new LinkedList<>();
	        
	        for(int i=0; i<record.length; i++) {
	            String[] empty = record[i].split(" ");
	        	if(!"Leave".equals(empty[0])) {
	        		map.put(empty[1], empty[2]);
	        	}
	            
	            if(!"Change".equals(empty[0])){
	        	    tmp.add(empty);
	            }
	        }

	        int count = 0;
	        String[] result = new String[tmp.size()];
	        
	        for(String[] t:  tmp) {
	        	if(t[0].startsWith("Enter")) {
	        		result[count++] = map.get(t[1]) + "님이 들어왔습니다.";
	        	}else if(t[0].startsWith("Leave")) {
	        		result[count++] = map.get(t[1]) + "님이 나갔습니다.";
	        	}
	        }
	        return result;
	    }

}
