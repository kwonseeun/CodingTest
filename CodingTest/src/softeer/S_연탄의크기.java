package softeer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class S_연탄의크기 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(); //집의 수
	        int[] house = new int[n]; //각 집 난로의 반지름 배열
	        for(int i = 0 ; i < n ; i++){
	            house[i] = sc.nextInt();
	        }

	        HashMap<Integer, Integer> count = new HashMap<>(); // key = 약수, value = 등장횟수
	        for(int i = 0; i < n ; i++){
	            for(int j = 2; j <= house[i] ; j++){ // 1은 모든 수의 약수이므로 제외
	                if(house[i] % j == 0){
	                    count.put( j, count.getOrDefault(j, 0) + 1);
	                }
	            }
	        }
	        //System.out.println(count);
	        int maxR = Collections.max(count.values()); // 약수의 등장횟수 중 가장 큰 값(value) 출력
	        System.out.println(maxR); 
	    }
}
