package baekjoon;

public class B_주식 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int tc = 0; tc < testCase; tc++) {
			int cnt = Integer.parseInt(br.readLine());
			long[] sto = new long[cnt];
			long max = 0;
			long ans=0;
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < cnt; i++) {
				sto[i]=Integer.parseInt(st.nextToken());
			}
			
			
			sb.append(ans+"\n");
		}
		System.out.println(sb);
	}
}
