package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
public static void main(String[] args) {
	int arr[]= {1,2,2,3,3};
	HashMap<Integer, Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		
	}
	for(Map.Entry<Integer, Integer>entrymap:map.entrySet()) {
		if(entrymap.getValue() != 1) {
			System.out.println(entrymap.getKey());
		}
	}
}
}
