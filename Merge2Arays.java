package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2Arays {
	public static void main(String[] args) {

		int a[] = { 2, 3, 5, 2};
		int a2[] = { 3, 7, 8 };
		int a3[] = new int[a.length + a2.length];
		int j = 0;
		for ( int i = 0; i < a.length; i++) {
			a3[j++] = a[i];
		}
		for(int k=0;k<a2.length;k++)
		{
			a3[j++]=a2[k];
			
		}
		
		Arrays.sort(a3);
		
		System.out.println(Arrays.toString(a3));

	}

}








class E{
	public static void main(String[] args) {
		int nums1[] = { 1,2,3,4};
		int nums2[] = { 2,5,6};
		int m=nums1.length;
       int  n=nums2.length;
        int i=0; int j=0;int k=0;
          int arr[]=new int[m+n];
          while(i<m && j<n){
           if(nums1[i]<nums2[j]){
               arr[k++]=nums1[i++];
           }
           else{
               arr[k++]=nums2[j++];
           }
          }
          while(i<m){
           arr[k++]=nums1[i++];
          }
          while(j<n){
          arr[k++]=nums2[j++];
          }
        System.out.println(Arrays.toString(arr));
	}
}