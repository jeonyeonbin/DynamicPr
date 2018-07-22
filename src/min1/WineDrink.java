package min1;
import java.util.Scanner;
public class WineDrink {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] wine = new int[N+1];
		int[] dp = new int[wine.length+1];
		for(int i =1;i<=N;i+=1) {
			wine[i] = scan.nextInt(); 
		}
		int max = -999;
		dp[1] =wine[1];dp[2] = wine[1]+wine[2];
		for(int i =3;i<wine.length;i+=1) {
			max = dp[i-1] > wine[i]+dp[i-2] ? dp[i-1] : wine[i]+dp[i-2];
			max = max> wine[i]+wine[i-1]+dp[i-3]?max : wine[i-1]+wine[i]+dp[i-3];
			dp[i] = max;
		}
		System.out.println(dp[wine.length-1]);
	}
}
