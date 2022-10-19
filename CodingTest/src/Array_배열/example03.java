package Array_배열;

public class example03 {
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		int sum = 0;
		
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if ( i%2 == 0) {
				System.out.println("배열 번지 " + "[ " + idx  + " ]" + sum + " + " + i + " = " );
				sum+= i ;
				arr[idx] = sum;
				System.out.println(sum);
			}else {
				System.out.println("배열 번지 " + "[ " + idx  + " ]" + sum  + " - " + i +  " = " );
				sum-= i ;
				arr[idx] = sum;
				System.out.println(sum);
			}
			idx ++;
		}
		
	}
}
