package programmers;

public class P_저주의숫자 {
	 public static void main(String[] args) {
	        System.out.println(solution(9   ));
//	        System.out.println(Arrays.toString(solution(new int[]{0,1,1,1,1}, 4)));
//	        for(int[] a : solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292},{487, 13, 876}})){
//	            System.out.println(Arrays.toString(a));
//	        }
	    }

	    public static int solution(int n) {
	        int answer = 0;
	        int idx = 0;
	        while(true){
	            if(n == idx){
	                break;
	            }
	            idx++;
	            answer++;
	            String str = answer+"";
	            if(answer % 3 == 0 || str.contains("3")){
	                while(true){
	                    answer++;
	                    str = answer+"";
	                    if(answer % 3 != 0 && !str.contains("3")){
	                        break;
	                    }
	                }
	            }
	        }
	        return answer;
	    }
}
