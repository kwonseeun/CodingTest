package algorythm01;

import java.util.Scanner;

/** 입력된 수 중 한번이라도 입력되었으면 중복을 제거하고 출력한다. 
 * 1~100까지 숫자가 입력될 때 한번이라도 입력되었으면 중복을 제거하고 출력*/
public class example08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
			for (int j = 0; j < i; j++) 
			{
				// i가 5일 때 => j는 0~4까지 비교 탐색, 중복 제거
				if(arr[i] == arr[j]) {
					// 중복된 수일 때 해당 중복되는 수 다시 입력 
					System.out.println("중복된 수입니다.");
					i--;
					continue;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i] + " ");
		}
	}
}
