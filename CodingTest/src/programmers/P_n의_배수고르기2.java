package programmers;

public class P_n의_배수고르기2 {
	public int[] solution(int n, int[] numlist) {
        int count = 0;

        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n==0){
                count++;
            }
        }

        int[] answer = new int[count];
        int index=0;
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n==0){
                answer[index]=numlist[i];
                index++;
            }
        }

        return answer;
    }
}
