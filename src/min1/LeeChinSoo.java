package min1;

public class LeeChinSoo {

	public static void main(String[] args) {
		int dp[] = new int[91];
		dp[1] =1;
		dp[2] =1;
		dp[3] =2;
		dp[4] =3;
		for(int i =5; i<91; i+=1) {
			dp[i] = i-1+(int)Math.pow(2, i-4)-1;
		}
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(dp[a]);
	}

}
