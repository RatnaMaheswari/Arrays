package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MajarityEleThanOthers {
	public static void main(String[] args) {
		int a[] = { 2, 2, 3, 3,3,2, 2};
		int length1 = a.length / 2;
System.out.println(length1);
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					c++;
				}
			}
			
			if (c > length1)
				System.out.println(a[i]);
		}
	}
}


class ByUsingHashMap{
	public static void main(String[] args) {
		int a[] = { 2, 2, 3, 4, 5, 6, 7};
		HashMap<Integer, Integer>map=new HashMap<>();
	
		for(int i=0;i<a.length;i++) {
			
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			
		}
		for(Map.Entry<Integer, Integer> map2:map.entrySet()) {
			if(map2.getValue()>a.length/2) {
			System.out.println(map2.getKey());
		}
		}
		
	}
}

class byUsingHashmapwithMajority{
	public static void main(String[] args) {
		int a[] = { 2, 2, 3, 3, 1, 2, 2 };
		HashMap<Integer, Integer>map=new HashMap<>();
		int majority=0;
		for(int i=0;i<a.length;i++) {
		if(map.containsKey(a[i])) {
			
		}	
		}
		}
}