package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayisSortedOrNot {
public static void main(String[] args) {
	
	int a[]= {20 ,21 ,45 ,89 ,89, 90};
	for(int i=1;i<a.length;i++) {
		if(a[i-1]<=a[i]) {
			System.out.println("yes");
		}
		else System.out.println("No");
	}
}
}

class Aa{
	 public static void main(String[] args) {
		int arr[]= {48,90,9,21,31,35,19,69,29,52,100,54,21,86,6,45,42,5,62,77,15,38};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}



class B{
	public static void main(String[] args) {
		String []names = {"Mary","John","Emma"}; 
		int[] heights = {180,165,170};
		String[] result=new String[names.length];
		HashMap<String, Integer> map= new HashMap<>();
		for(int i=0;i<names.length;i++) {
			map.put(names[i], heights[i]);
		}
		
	}
}


