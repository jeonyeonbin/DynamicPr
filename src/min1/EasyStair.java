package min1;
import java.util.Scanner;
public class EasyStair {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long dp[][] = new long[N+1][11];
		for(int i =1;i<=9;i+=1) {
			dp[1][i] =1;
		}
		int div = 1000000000;
		for(int i =2; i<=N; i+=1) {
			dp[i][0] = dp[i-1][1];
			for(int j =1;j<=9; j+=1) {
				if(j == 9)
					dp[i][j] = dp[i-1][j-1]%div;
		 		dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%div;
			}
		}
		long sum = 0;
		for(int i =0;i<10;i+=1) {
			sum += dp[N][i];
		}
		System.out.println(sum%div);
	}

}
