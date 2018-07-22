package min1;

import java.util.Arrays;

public class SortingTest {
	public static boolean isSorted(double a[]) {
		for(int i =1; i<a.length;i+=1) if(a[i]<a[i-1]) return false;
		return true;
	}
	public static void quickSort(double[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		double pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				double temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
	public static double[] merge(double a[],double b[]) {
		double[] c = new double[a.length+b.length];
		System.out.println(a.length);
		for(int i =0; i<c.length; i+=1) {
			if(i< a.length) {
				c[i] = a[i];
			}
			else {
				c[i] = b[i-b.length];
				if(c[i]< b[i-b.length]) c[i] = b[i-b.length];
				else quickSort(c,0,i);
				Arrays.sort(c);
			}
		}
		
		return c;
	}
	public static void main(String[] args) {
		
		double[] a = {1,2,7};
		double[] b = {2,5,10};
		if(isSorted(a)) System.out.println("정렬이 되어있습니다");
		else System.out.println("정렬이 되지않았습니다");
		double[] c = merge(a,b);
		for(int i =0; i<c.length;i+=1) {
			System.out.println(c[i]);
		}
	}

}
