package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B_좌표압축 {
	 public static void main(String[] args) throws IOException {
	        System.setIn(new FileInputStream("src/input.txt"));
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringTokenizer stk;

	        int n = Integer.parseInt(br.readLine());
	        Map<Integer, Integer> hm = new HashMap<>();
	        int [] arr = new int[n];
	        Integer [] temp = new Integer[n];
	        stk = new StringTokenizer(br.readLine());
	        for(int i = 0 ; i < n ; i++){
	            arr[i] = Integer.parseInt(stk.nextToken());
	            temp[i] = arr[i];
	        }

	        Arrays.sort(temp); int rank = 0;
	        for(int i = 0; i < n; i++){
	            if(hm.containsKey(temp[i])){
	                continue;
	            } else {
	                hm.put(temp[i], rank++);
	            }
	        }
	        for(int i = 0 ; i < n ; i++){
	            bw.write(hm.get(arr[i])+" ");
	        } bw.write("\n");


	        bw.flush();
	        bw.close();
	    }
}
