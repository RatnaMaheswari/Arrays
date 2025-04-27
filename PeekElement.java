package arrays;

public class PeekElement {
public static void main(String[] args) {
	int a[]={10, 20, 15, 2, 23, 90, 67};
	int count=0;
	for(int i=1;i<a.length-2;i++) {
		if((a[i]>a[i-1])&&(a[i]>a[i+1])) {
			count++;
			System.out.println(a[i]);
		}
		
	}
	/*for(int i=1;i<a.length-2;i++) {
		
			if((a[i]>a[i-1])&&(a[i]>a[i+1])) {
				if(count>1) {
					System.out.println(i);
					
				}else
				{
					System.out.println(a[i]);
				}
		}*/
	
}
}

