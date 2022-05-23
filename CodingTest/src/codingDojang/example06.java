package codingDojang;

public class example06 {

	public static void main(String[] args) {
	int count = 8;
	for (int i = 0; i < count; i++) {
		System.out.print(fibonacci(i) + " ");
	}
}
	
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}

}
