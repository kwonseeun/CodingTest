package baekjoon;

import java.util.Scanner;

public class B_도비의영어공부 {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int count;

        while(true){
            String ch = scanner.nextLine();

            count=0;

            if(ch.equals("#")){
                break;
            }

            String chArr[] = ch.toLowerCase().split("");

            for(int i=1;i< chArr.length;i++){
                if(ch.split(" ")[0].equals(chArr[i])){
                    count=count+1;
                }
            }

            System.out.println(ch.split(" ")[0]+" "+count);

        }
    }
}
