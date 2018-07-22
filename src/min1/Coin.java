package min1;
public class Coin {
	public static void main(String[] args) {
		int coins[] = {1,5,10,50,100,500};
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int dp[] = new int[n+1];
		
		dp[0] = 0;
		for(int i =1; i <n+1; i++) {
			int min=9999;
			for(int j =0;j<6; j++) {
				if(coins[j]<= i &&dp[i-coins[j]]+1 < min) {
						min = dp[i-coins[j]]+1;
						dp[i] = min;
				}
			}
		}		
		System.out.println(dp[n]);
	}

}
