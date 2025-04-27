package arrays;

import java.util.Arrays;

public class RemoveArrElement {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int j=0;
	int target=4;
	int a2[]=new int[a.length-1];
	for(int i=0;i<a.length;i++) {
		if(a[i]!=target) {
			a2[j++]=a[i];
			
		}
	}System.out.println(Arrays.toString(a2));
}
}
