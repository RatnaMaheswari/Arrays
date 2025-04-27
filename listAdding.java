package arrays;

import java.util.LinkedList;
import java.util.*;

public class listAdding {
 public static void main(String[] args) {
	 int sum=0;
	LinkedList<Integer> list=new LinkedList<>();
	list.add(2);
	list.add(4);
	list.add(5);
	for(int i=0;i<list.size();i++) {
		
		sum=list.get(i)%10;
		
		 
	}
	System.out.println(sum);
	System.out.println(list);
	
	LinkedList<Integer> list2=new LinkedList<>();
	list2.add(5);
	list2.add(6);
	list2.add(4);
	System.out.println(list2);
	
	
}
}
