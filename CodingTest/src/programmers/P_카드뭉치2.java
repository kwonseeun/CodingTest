package programmers;

public class P_카드뭉치2 {
	public static void main(String[] args) {
        System.out.println(solution(new String[]{"want", "to"}, new String[]{"water", "drink", "wow"}, new String[]{"water", "drink", "want", "to"}));
//        System.out.println(Arrays.toString(solution(8, new int[]{100, 100, 100, 100, 100, 100, 100})));
//        for(int[] a : solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292},{487, 13, 876}})){
//            System.out.println(Arrays.toString(a));

//        }
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int oneIdx = 0;
        int twoIdx = 0;
        int goalIdx = 0;
        while (true) {
            if (goalIdx >= goal.length) {
                answer = "Yes";
                break;
            }
            if (oneIdx < cards1.length && goal[goalIdx].equals(cards1[oneIdx])) {
                oneIdx++;
            } else if (twoIdx < cards2.length && goal[goalIdx].equals(cards2[twoIdx])) {
                twoIdx++;
            } else {
                answer = "No";
                break;
            }
            goalIdx++;
        }
        if (goal.length > cards1.length + cards2.length) {
            answer = "No";
        }
        return answer;
    }
}
