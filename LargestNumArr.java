package arrays;

import java.util.Arrays;

public class LargestNumArr {
	public static void main(String[] args) {
		int arr[]= {25,23,4,5,6,1};
		int temp=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[0]) {
				temp=arr[i];
			}
		}
		
		System.out.println(temp);
		System.out.println(Arrays.toString(arr));
	
	}
	
    
}

