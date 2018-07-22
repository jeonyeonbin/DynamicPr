package min1;

import java.util.Arrays;

public class Cute {
	public static void main(String[] args) {
		
		int a[] = new int[104];
		java.util.Scanner scan = new java.util.Scanner(System.in);
		a[102] = scan.nextInt();
		for( int i =0; i <a[102]; i+=1) {
			a[i] = scan.nextInt();
			if(a[i] == 1) {
				a[103]++;
			}
		}
		if(a[103]> a[102]-a[103]) {
			System.out.println("JunHee is Cute!");
		}else {
			System.out.println("JunHee is not Cute!");
		}
	}
	
}
