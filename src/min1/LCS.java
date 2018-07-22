package min1;
import java.util.Scanner;
import java.util.Stack;
public class LCS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a1 = scan.nextLine();//
		String b1 = scan.nextLine();
		String c1 = scan.nextLine();
		int aLength = a1.length();
		int bLength = b1.length();
		int answer[][] = new int[aLength+1][bLength+1];
		for(int i =1; i<aLength+1;i+=1) {
			for(int j =1; j<bLength+1;j+=1) {
				if(a1.charAt(i-1) == b1.charAt(j-1)) {
					answer[i][j] = answer[i-1][j-1]+1;
				}else {
					answer[i][j] = answer[i-1][j] > answer[i][j-1] ? answer[i-1][j] : answer[i][j-1];
				}
			}
		}
		Stack<Character> stack = new Stack<Character>();
		while(aLength!=0) {
			if(answer[aLength][bLength] == answer[aLength-1][bLength]) {
				aLength--;
			}
			else if(answer[aLength][bLength] ==answer[aLength][bLength-1] ) {
				bLength--;
			}
			else if(answer[aLength][bLength]-1 == answer[aLength-1][bLength-1]){
				stack.push(a1.charAt(aLength-1));
				aLength--;
				bLength--;
			}
		}
		StringBuilder str = new StringBuilder();
		while(!stack.isEmpty()) {
			str.append(stack.pop());
		}
		int cLength = c1.length();
		String ab = str.toString();
		int abLength = ab.length();
		int answer2[][] = new int[100][100];
		for(int i =1; i<abLength+1;i+=1) {
			for(int j =1; j<cLength+1;j+=1) {
				if(ab.charAt(i-1) == c1.charAt(j-1)) {
					answer2[i][j] = answer2[i-1][j-1]+1;
				}else {
					answer2[i][j] = answer2[i-1][j] > answer2[i][j-1] ? answer2[i-1][j] : answer2[i][j-1];
				}
			}
		}
		System.out.println(answer[abLength][cLength]);
	}
}
