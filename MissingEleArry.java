package arrays;

import java.util.Arrays;

public class MissingEleArry {
	
public static void main(String[] args) {
	 
	
	int arr[]= {1,2,4,6};
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i+1]-arr[i]==1) {
			continue;
			}
		else 
			System.out.println(arr[i]+1);
		
		}
}}



class AnotherProcess{
	public static void main(String[] args) {
		int arr[]= {6,4,2,3,0,1};
		 int n=arr.length;
			int sum = 0;
	        for (int i = 0; i < n ; i++) {
	            sum =sum+ arr[i];
	        }
	        int tSum = (n * (n + 1)) / 2;
	        
	       int num=tSum - sum;
	       System.out.println(num);
	}
}





