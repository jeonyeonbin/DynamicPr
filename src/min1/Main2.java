package min1;

public class Main2 {
	public static void main(String[] args) {
		int dp[] = new int[12];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i =4;i<11;i+=1) {
			dp[i] = dp[i-3] +dp[i-2] +dp[i-1];
		}
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int b;
		while(a-- >0) {
			b= scan.nextInt();
			System.out.println(dp[b]);
		}
	} 
}
