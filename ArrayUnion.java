package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayUnion {
public static void main(String[] args) {
	int a[]= {1,6,2,1,2,3};
	int a2[]= {2,4,3,5};
	Set <Integer> set=new HashSet<>();
	for(int i=0;i<a.length;i++) {
		set.add(a[i]);
		}
	for(int i=0;i<a2.length;i++) {
		set.add(a2[i]);
	}
	System.out.println(set);
}
}


class Intersection{
	public static void main(String[] args) {
		int a[]= {1,6,2,1,2,3};
		int a2[]= {2,4,3,5};
		System.out.println("********");
		List<Integer> arrayList=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a[i]==a2[j])
					arrayList.add(a[i]);
			}
		}System.out.println(arrayList);
	}
	}
	

