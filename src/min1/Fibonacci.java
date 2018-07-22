package min1;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int dp[] = new int[1001];
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		dp[0] =1;
		dp[1] = 1;
		for(int i = 2; i<N+1;i+=1) {
			dp[i] = (dp[i-1]+dp[i-2])%10007;
		}
		System.out.println(dp[N]%10007);
	}
}
