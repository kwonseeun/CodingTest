package codingDojang;

public class example23 {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 1, 4, 1, 5, 9, 2, 6 };

        int swap = 0;
        int loop = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
 
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                    swap++;
                } else {
                    loop++;
                }
            }
        }

        System.out.println(loop + " " + swap);
    }
}
