package min1;
public class Main {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int dp[] = new int[1000001];
		dp[1] = 1; dp[2] =1; dp[3] = 1;
		//1�θ��� ���ϱ⸦ �޴µ� 2�γ��������� 2�γ����� �ε������ٰ� 1�����Ѵ� 
		//3���� �������� 3���γ����������ٰ� 1�����Ѵ�
		for(int i =4; i <= a; i+=1) {
			dp[i] = dp[i-1]+1; //1�δ��ϱ�
			if(i%2==0) dp[i] = Math.min(dp[i],dp[i/2] +1); //2�γ�����
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3] +1); //3���γ�����
		}
		System.out.println(dp[a]);
	}
}
