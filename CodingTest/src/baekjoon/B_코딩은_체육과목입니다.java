package baekjoon;

import java.util.Scanner;

public class B_코딩은_체육과목입니다 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < a / 4; i++) {
            answer.append("long ");
        }
        System.out.println(answer + "int");
    }
}
