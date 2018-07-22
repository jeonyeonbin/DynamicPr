package min1;
import java.util.Scanner;
public class Longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = {60, 20, 10, 30, 20, 50};
        int max=1;
        int dp[] = new int[N];
        for(int i=0; i<N; i++){
            dp[i]=1;
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j] && dp[i]<=dp[j]){
                    dp[i]+=1;
                    if(max<dp[i]){
                        max = dp[i];
                        System.out.println("max : "+max);
                    }
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}