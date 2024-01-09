package programmers;

public class P_구슬을나누는_경우의수 {
	public static void main(String[] args) {
        System.out.println(solution(30,14));

//        System.out.println(Arrays.toString(solution(1, 4, 2, 16)));
//        for(int[] a : solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292},{487, 13, 876}})){
//            System.out.println(Arrays.toString(a));
//        }
    }

    public static int solution(int balls, int share) {
        int answer = 0;
        double n = 1;
//        long m = 1;
        int max = Math.max(share, balls-share);
        int idx = 2;

        //2 3 4 5 6 7 8 9 10 11 12 13
        //30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14
        for(int i=max+1; i<=balls; i++){
            n *= i;
            if(idx <= balls-max){
                n/=idx;
                idx++;
            }
        }
        System.out.println(n);

        return answer;
    }
}
