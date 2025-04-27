package arrays;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Example {
public static void main(String[] args) {
	Date start=new Date();
	List<String> l=new ArrayList<>();
	for(int i=0;i<10;i++) {
		l.add("sample name");
	}
	Date end=new Date();
	System.out.println("time taken:"+(end.getTime()-start.getTime())+"ms");
}
}
