package mini;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		char oper;
		
		System.out.println("첫 번째 숫자를 입력하세요,");
		a = sc.nextInt();
		System.out.println("연산자를 입력하세요 ( +,-,*,/");
		oper = sc.next().charAt(0);
		System.out.println("두 번째 숫자를 입력하세요.");
		b = sc.nextInt();
		
		switch (oper) {
		case '+':
			System.out.println("덧셈 결과는" + a + "+" + b + " = " + Calculate.add(a, b));
			break;

		case '-':
			System.out.println("뺄셈 결과는" + a + "-" + b + "= "+ Calculate.min(a, b));
			break;

		case '*':
			System.out.println("곱셈 결과는 " + a + "*" + b + "=" + Calculate.mul(a, b));
			break;

		case '/':
			System.out.println("나누기 결과는 " + a + "/" + b + "=" + Calculate.div(a, b));
			break;
		}
	}

}
