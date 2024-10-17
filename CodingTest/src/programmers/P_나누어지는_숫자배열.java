package programmers;

import java.util.Arrays;

public class P_나누어지는_숫자배열 {
	 public int[] solution(int[] arr, int divisor) {
	        int leng = 0; // answer의 길이
	        int n = 0;

	        //answer[] 길이 찾기
	        for(int i = 0 ; i < arr.length ; i++ ){
	            if(arr[i] % divisor == 0){
	                leng++;
	            } 
	        }

	        //길이가 0이면 -1
	        if(leng == 0){
	           int[] answer = {-1};
	            return answer;
	        } 

	        //leng 만큼의 길이인 배열 선언
	       int[] answer = new int[leng];

	        //arr가 나눠지면 answer에 담는다
	        for(int i = 0; i < arr.length ; i++){
	            if(arr[i] % divisor == 0){
	                answer[n] = arr[i];
	                n++;
	            }
	        }

	        //arr[] sorting하기
	        Arrays.sort(answer);

	        //출력 확인하기 위한 코드
	        System.out.println(Arrays.toString(answer));
	        System.out.println(leng);

	        return answer;
	    }
}
