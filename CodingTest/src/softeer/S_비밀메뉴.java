package softeer;

import java.util.Scanner;

public class S_비밀메뉴 {
	 public static void main(String args[])
	    {
	       
	        Scanner sc = new Scanner(System.in);
	        int M = sc.nextInt();
	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        String answer = "normal";

	        String secret = "";
	        String push ="";
	        for (int i=0; i<M; i++) {
	            secret+= sc.nextInt();
	        }
	        for (int i=0; i<N; i++) {
	            push += sc.nextInt();
	        }
	        
	        if (push.contains(secret)) {
	            System.out.println("secret");
	        } else {
	            System.out.println("normal");
	        }
	    }
}
