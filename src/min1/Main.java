package min1;
public class Main {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int dp[] = new int[1000001];
		dp[1] = 1; dp[2] =1; dp[3] = 1;
		//1로먼저 더하기를 햇는데 2로나누어지면 2로나눈값 인덱스에다가 1을더한다 
		//3으로 나눠지면 3으로나눠진값에다가 1을더한다
		for(int i =4; i <= a; i+=1) {
			dp[i] = dp[i-1]+1; //1로더하기
			if(i%2==0) dp[i] = Math.min(dp[i],dp[i/2] +1); //2로나누기
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3] +1); //3으로나누기
		}
		System.out.println(dp[a]);
	}
}
