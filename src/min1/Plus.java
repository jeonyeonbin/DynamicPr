package min1;
import java.util.Scanner;
public class Plus {
	public static void main(String[] args) {
		long arr[] = {-1,3,-1,5};
	    int number;
	    Scanner scan = new Scanner(System.in);
	    long max= arr[0];long current=arr[0];
	    for(int j=1; j<arr.length;j+=1){
	    	current = current+arr[j] > arr[j] ? current+arr[j] : arr[j];
	    	System.out.println("current : "+ current);
	    	max = max> current? max : current;
	    	System.out.println("max : "+ max);
	    }
	    System.out.println(max);
	}
}
