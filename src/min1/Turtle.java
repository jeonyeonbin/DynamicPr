package min1;

import java.util.Arrays;

public class Turtle {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a[] = new int[4];
		for(int i =0;i<4;i+=1) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		for(int i =0;i<4;i+=1) {
			System.out.println(a[i]);
		}
		System.out.println((a[0] * a[2]));
	}
}
