package softeer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_hash {
	public static void main(String[] args) {
		class Main {
		    static int n,q;
		    static int[] cars;
		    
		    public static void main(String args[]) throws IOException {
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		        StringTokenizer st1 = new StringTokenizer(br.readLine());
		        n = Integer.parseInt(st1.nextToken()); //전체 차의 수
		        q = Integer.parseInt(st1.nextToken()); //케이스 경우의 수

		        cars = new int[n]; //자동차 연비들
		        StringTokenizer st2 = new StringTokenizer(br.readLine());
		        for(int i = 0 ; i < n ; i++) {
		            cars[i] = Integer.parseInt(st2.nextToken());
		        }

		        Arrays.sort(cars); //정렬

		        for(int i = 0 ; i < q ; i++) {
		            int want = Integer.parseInt(br.readLine());
		            int idx = findIdx(want);

					//처음과 끝이라면 중간값일 수 없음
		            if(want == cars[0] || want == cars[n-1]) {
		                bw.write(String.valueOf(0) + "\n");
		            }
		            //해당 매서드에서 -1이 나온다면 유효하지 않은 값
		            else if(findIdx(want) == -1) {
		                bw.write(String.valueOf(0) + "\n");
		            }
		            //유효한 값이 나왔다면, 중간값의 경우의 수를 입력해줌
		            else {
		                bw.write(String.valueOf(idx * (n-idx-1)) + "\n");
		            }
		        }

		        bw.flush();
		        bw.close();

		    }


		    static int findIdx(int want) { //index를 찾는 이분탐색
		        int s = 0;
		        int e = n;

		        while(s < e) {
		            int m = (s+e)/2;

		            if(cars[m] > want) {
		                e = m;
		            }
		            else if(cars[m] < want) {
		                s = m+1;
		            }
		            else {
		                return m;
		            }
		        }
				//-1은 유효하지 않은 값.
		        return -1;
		    }
		}
	}
}
