package min1;
public class Main1 {
	private static int weight(int num) {
		int five = 5, key =  0, number= num;
		int[] count = new int[3000];
		int loop = (num/5)+1;
		for(int i =0; i<loop;i+=1) {
			num = number;
			num = num-(five*i);
			if(num%3==0) {
				key++;
				count[i] = (num/3)+ i;
			}
		}
		if(key==0) return -1;
		else {
			java.util.Arrays.sort(count);
			for(int i =count.length-1; i>=0;i-=1) {
				if(count[i]==0) return count[i+1];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(weight(a));
	}
}
