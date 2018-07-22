package min1;
public class Coin2 {
	public static void main(String[] args) {
		int coins[] = new int[101];
		int dp[] = new int[100001];
		int n, k;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
		for (int j = 0; j < n; j += 1) {
			coins[j] = scan.nextInt();
			dp[coins[j]] = 1;
		}
		dp[0] = 0;
		for (int i = 1; i < k + 1; i += 1) {
			for (int f = 0; f < n; f += 1) {
				if(i-coins[f] <0) {
					continue;
				}else {
					if(dp[i - coins[f]] == 0) {
						continue;
					}else {
						if(dp[i] == 0) {
							dp[i]= dp[i-coins[f]]+1;
						}else {
							dp[i] = Math.min(dp[i],dp[i-coins[f]]+1);
						}
					}
				}
		
			}
			
		}
		if(dp[k] ==0 ) {
			System.out.println("-1");
			return;
		}
		System.out.println(dp[k]);
	}

}
