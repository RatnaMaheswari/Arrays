package arrays;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int arr[] = {1, 4, 3, 2, 6, 5,7};
	
	int start=0;
	
	int end=arr.length-1;
	for(int i=0;i<arr.length/2;i++) {
		int temp=arr[start];
		arr[start++]=arr[end];
		arr[end--]=temp;
		
		
		
	}
	System.out.println(Arrays.toString(arr));
		}
	}
	

