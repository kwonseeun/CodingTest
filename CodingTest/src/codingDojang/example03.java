package codingDojang;
import java.util.Scanner;

public class example03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 건수를 입력하세요:");
		int total = sc.nextInt();
		
		System.out.println("게시물 수를 입력하세요: ");
		int sum = sc.nextInt();
		
		int page = total/sum;
		if (page % 2 == 0) {
			System.out.println("필요한 페이지의 수는:" + page +"입니다");
		} else if(page % 2 == 1) {
			System.out.println("필요한 페이지의 수는" + (page+1) + "입니다.");
		}
	}

}
