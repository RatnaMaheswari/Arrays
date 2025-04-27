
package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleEleAmongDouble {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 4, 5, 3, 4 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1)
				System.out.println(arr[i]);
		}
	}
}


class AnotherExample{
	public static void main(String[] args) {
		int arr[] = { 2, 3, 3,5, 4, 5, 3, 4 };
		 Map<Integer, Integer> map = new HashMap<>();

	        
	        for(int i=0;i<arr.length;i++) {
	        	
	        	map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
	        }
	        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
	        	if(entry.getValue()==1) {
	        		System.out.println(entry.getKey());
	        	}
	        }

	}
}