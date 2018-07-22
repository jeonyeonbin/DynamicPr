package min1;
import java.util.Scanner;
public class Sticker {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int N =scan.nextInt();
		int[][] sticker = new int[2][N+1];
		for(int i=0;i<2;i+=1) {
			for(int j =1;j<=N;j+=1) {
				sticker[i][j] = scan.nextInt();
				System.out.print(sticker[i][j] + "  ");
			}
			System.out.println(" ");
		}
	}
}
