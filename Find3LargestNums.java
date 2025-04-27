package arrays;

import java.util.Arrays;

public class Find3LargestNums {
	public static void main(String[] args) {
		int a[] = { 1,5,20,10,30 };
		int temp=a[0];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		
		}for(int i=a.length-1;i>=a.length-3;i--) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));

	}
}
