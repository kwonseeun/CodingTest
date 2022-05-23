package codingDojang;

public class example11 {

	public static void main(String[] args) {
		int num[] = new int[10];
		int count[] = new int[10];
		
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()* 10);
			System.out.print(num[i]+ " ");
		}
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			count[num[i]]++;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+"의 갯수 " + count[i]);
		}	
	}
}
