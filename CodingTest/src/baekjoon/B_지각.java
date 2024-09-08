package baekjoon;

public class B_지각 {
	 public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        int num, t;

	        for(int i=0;i<n;i++){

	            num = scanner.nextInt();
	            t=0;

	            while(true){

	                if( t*t+t > num){
	                    System.out.println(t-1);
	                    break;
	                }

	                t=t+1;
	            }
	        }
	    }
}
