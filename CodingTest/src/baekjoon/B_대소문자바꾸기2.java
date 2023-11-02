package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_대소문자바꾸기2 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        char[] charArray = input.toCharArray();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if('a' <= ch && ch <= 'z') charArray[i] = Character.toUpperCase(ch);
            else charArray[i] =Character.toLowerCase(ch);            
        }
        
        System.out.println(charArray);
    }
}
