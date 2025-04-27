package arrays;

import java.util.Arrays;

public class SceondLargeElemeArry {
	public static void main(String[] args) {
		int a[] = {3,4,4,6,6,5,5,2,1};
		int largest = a[0];
		int secondlargest = -1;
		
		for (int i = 0; i < a.length; i++) {
         if(a[i]>largest) {
        	 secondlargest= largest;
        	 largest=a[i];
        	 
         }
         else if(a[i]<largest&&a[i]>secondlargest){
        	 secondlargest=a[i];
         }
         
		}
		
		System.out.println(secondlargest);
	}
}

 class SecondSmallest{
	public static void main(String[] args) {
		int a[] = {3,4,4,6,5,2,2,1,1,0,1,-1};
		int smallest=a[0];
		int secondsmalest=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				secondsmalest=smallest;
				smallest=a[i];
			}
			else if(a[i]<smallest&&a[i]<secondsmalest) {
				secondsmalest=a[i];
			}
		}System.out.println(secondsmalest);
		
	}
}
 
 
 
 
 
 