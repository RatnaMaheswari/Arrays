package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RelativeArray {
public static void main(String[] args) {
	int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
	int []arr2 = {2,1,4,3,9,6};
	int arr3[]=new int[arr1.length];
	HashMap<Integer, Integer> map=new LinkedHashMap<>();
	for(int i=0;i<arr1.length;i++) {
		map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
		
	}
	System.out.println(map);
	int k=0;
	for(int i=0;i<arr2.length;i++) {
		int count=map.get(arr2[i]);
		for(int j=0;j<count;j++) {
			arr3[k++]=arr2[i];
		}
		map.remove(arr2[i]);
		}
		
	for(Map.Entry<Integer, Integer> key:map.entrySet()) {
		int count=key.getValue();
		for(int j=0;j<count;j++) {
			arr3[k++]=key.getKey();
		}
	}
	System.out.println(Arrays.toString(arr3));
}
}
