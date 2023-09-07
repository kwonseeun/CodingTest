package kakao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class K_튜플 {
	public int[] solution(String str) {
        String reStr = str.replaceAll("\\{","").replaceAll("\\}","");
        String[] strs = reStr.split(",");
        Map<Integer, Integer> map = new HashMap<>();

        for(String s : strs){
            int key = Integer.parseInt(s);
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        
        LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();

            map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        ArrayList<Integer> list = new ArrayList(reverseSortedMap.keySet());

        int[] re = new int[list.size()];
        for(int i=0; i < re.length; i++){
            re[i] = list.get(i);
        }

        return re;
    }
}
