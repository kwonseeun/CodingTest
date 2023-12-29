package programmers;

public class P_숫자짝꿍 {
	   public static void main(String[] args) {
	        System.out.println(solution("5525", "1255"));
//	        System.out.println(Arrays.toString(solution(new int[]{180, 5000, 10, 600}, new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"})));
//	        for(int[] a : solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292},{487, 13, 876}})){
//	            System.out.println(Arrays.toString(a));

//	        }
	    }

	    public static String solution(String X, String Y) {
	        String answer = "";
	        char[] xArr = X.toCharArray();
	        char[] yArr = Y.toCharArray();
	        int[] num1 = new int[10];
	        for (int i = 0; i < xArr.length; i++) {
	            num1[(xArr[i] - '0')]++;
	        }
	        int[] num2 = new int[10];
	        for (int j = 0; j < yArr.length; j++) {
	            num2[(yArr[j] - '0')]++;
	        }

	        boolean isNotSame = true;
	        boolean isZero = false;
	        if (num1[0] > 0 && num2[0] > 0) {
	            isZero = true;
	        }
	        for (int i = num2.length - 1; i >= 0; i--) {
	            if (num1[i] > 0 && num2[i] > 0) {
	                isNotSame = false;
	                int min = Math.min(num1[i], num2[i]);
	                String str = i + "";
	                if (i != 0) {
	                    isZero = false;
	                }
	                answer += str.repeat(min);
	            }
	        }
	        if (isNotSame) {
	            answer = "-1";
	        } else {
	            if (isZero) {
	                answer = "0";
	            }
	        }
	        return answer;
	    }
}
