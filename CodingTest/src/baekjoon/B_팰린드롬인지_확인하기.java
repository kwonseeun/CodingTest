package baekjoon;

import java.util.Scanner;

public class B_팰린드롬인지_확인하기 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder answer = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            answer.append(ch);
        }

        if (s.contentEquals(answer)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
