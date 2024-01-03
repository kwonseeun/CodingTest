package programmers;

import java.util.HashMap;

public class P_달리기경주2 {
	public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i=0; i<callings.length; i++){
            int rank = map.get(callings[i]);
            if(rank == 0){
                continue;
            }else{
                String temp = players[rank];
                map.put(temp, rank-1);
                players[rank] = players[rank-1];
                map.put(players[rank], rank);
                players[rank-1] = temp;
                
            }
        }
        return players;
    }
}
