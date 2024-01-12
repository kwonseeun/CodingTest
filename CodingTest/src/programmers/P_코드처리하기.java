package programmers;

public class P_코드처리하기 {
	public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
//        System.out.println(Arrays.toString(solution(5, 555)));
//        for(int[] a : solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292},{487, 13, 876}})){
//            System.out.println(Arrays.toString(a));
//        }
    }

    public static String solution(String code) {
        String answer = "";
        int mode = 0;
        int value = 0;
        for(int i=0; i<code.length(); i++){
            if(code.charAt(i) == '1'){
                if(mode == 0){
                    mode = 1;
                    value = 1;
                }else{
                    mode = 0;
                    value = 0;
                }
            }else {
                if(i%2 == value){
                    answer +=code.charAt(i)+"";
                }
            }
        }
        if(answer.length() == 0){
            answer = "EMPTY";
        }
        return answer;
    }
}
