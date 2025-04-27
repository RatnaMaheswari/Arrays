package arrays;

import java.util.Arrays;

public class ArraySum {
public static void main(String[] args) {
	int arr[]= {2,5,1,9,6};
	int sum=0;
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println(sum);
	
}
}


