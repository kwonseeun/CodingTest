package programmers;

public class P_자연수뒤집어_배열로만들기 {
	 public int[] solution(long a) {
	      int count = (int)(Math.log10(a)+1);
			int[] arr = new int[count];
			int num = 0;
			
			while(num < count) {
				arr[num]=(int)(a%10);
				a/=10;
				num++;
			}
	      return arr;
	  }
}
