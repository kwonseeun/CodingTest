package baekjoon;

public class B_신기한소수 {
	static final int[] primeNums = {2,3,5,7};
    public static void main(String[] args) throws Exception {
        // 신기한 소수 구하기 (모든 자리 수가 소수다)
        // N의 최대값이 8 -> 즉 입력값의 최대 값이 9999만
        // 에라토스테네스의 체로 소수를 구할 경우 400mb(400000000byte)를 차지하는데 문제에서 제시하는 메모리 제한은 4MB
        // 따라서 매번 소수를 새롭게 구해야 한다.
        // 모든 경우의 수를 구하는 문제이므로 dfs

        // 자리수 N 입력 받기

        // dfs 탐색(인자 n, 자리수 N)
        // 인자 n은 소수 1,3,5,7로 직접 지정
    }

    // 소수 구하는 함수
    public static boolean isPrimeNum(int n) {
        // 만약 인자 n이 0, 1이라면 false
        if (n==0 || n==1) return false;
        // 반복문
        for (int i=2; i*i<=n; i++) {
            //  i=2; i*i<=n; i++;
            if (n%i == 0) return false;
            //  if ( n % i == 0 ) return false;
            // 반복문 끝 ? return true;;
        }
        return true;
    }

    // dfs 탐색
    public static void dfs(int num, int digits) {
        // if 자리수 N이 0이 된다면 소수인지 판별하고 맞으면 출력

        // 반복문
        // 1~10 반복하며 소수인지 체크하고 소수라면 digits는 -, num은 소수와 합쳐서 재귀
    }
}
