package arrays;

import java.util.Arrays;

public class AddOnePlus {
	public static void main(String[] args) {
		int a[]= {4,5,9};
		int c=1;
		for(int i=a.length-1;i>=0;i--)
		{
			a[i]=a[i]+c;
			if(a[i]==10) {
				
				a[i]=0;
				c=1;
			}else
			{
				c=0;
				break;
			}
	}System.out.println(Arrays.toString(a));
	if(c==1) {
		int b[]=new int[a.length+1];
		b[0]=1;
		System.out.println(Arrays.toString(b));
	}
	}
}