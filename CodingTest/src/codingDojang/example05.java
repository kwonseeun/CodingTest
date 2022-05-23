package codingDojang;

/**n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.*/
public class example05 {

	public static void main(String[] args) {
		int[] list = { -1,1,-3,3,-2,2,4 };
		int length = list.length-1;
		for (int i = 0; i < length; i++) {
		for (int j = 0; j < (length-i); j++) {
			if (list[j] > 0 && list[j+1] < 0) {
				int k = list[j];
				list[j] = list[j+1];
				list[j+1] = k;
				}
			}	
		}
		for (int k : list) {
			System.out.print(k +" ");
		}
	}

}
