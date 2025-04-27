package arrays;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArry {

	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 1, 2, 3, 4, 5 };
		//ArrayList <Integer> integers=new ArrayList<>();
		int d = a.length; int j = 0;
		int a2[] = new int[d];
	
		Arrays.sort(a);
		// System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
			
				a2[j++] = a[i];
				
				d--;

			}

		}
		a2[j++] = a[a.length - 1];
		
		System.out.println(Arrays.toString(a2));
		for (int k = 0; k <= d; k++) {
			System.out.print(a2[k]);
			//integers.add(a[a.length - 1]);
			//System.out.println(integers);
		
		}
	}
}


class SecondExample
{
	public static void main(String[] args) {
		int nums[] = { 1, 1,2,2,2,3,4,5,6,6};
		int j = 0;
		int n2[]=new int[nums.length];
		
		
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				
				n2[j++] = nums[i];
				}
           }
		n2[j++] = nums[nums.length - 1]; 
	        System.out.println(j);
	        System.out.println(Arrays.toString(n2));
}}

class RemoveBySet{
	public static void main(String[] args) {
		int a[]= {1,3,2,1,4,6,5,2,5,3};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Set<Integer>set =new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
			
		}
		System.out.println(set);
	}
}







class A{
	public static void main(String[] args) {
		int arr[]= {0,0,1,1,1,2,2,3,3,4}; int count=0; int j=0;
		int arr2[]=new int[arr.length];
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr2[j++]=arr[i];
				
				
			}
			
			
		}
		arr2[j++]=arr[arr.length-1];
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(j);
	}
}


