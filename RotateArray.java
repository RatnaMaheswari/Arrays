package arrays;

import java.util.Arrays;

public class RotateArray {
public static void main(String[] args) {
	int a[]= {6,2,3,4,5,1};
	int temp=a[0];
	int count=0;
	for(int i=0;i<a.length-1;i++) {
	
		temp=a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		
		
	}System.out.println(Arrays.toString(a));
	}

}

class RotateMorethanOne{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7};
		int a2[]=new int [a.length];
		int j=0;
		for(int i=2;i<a.length;i++) {
			a2[j++]=a[i];
		}
		
		  for(int i=0;i<2;i++) { 
			  a2[j++]=a[i]; 
			  }
		 
		System.out.println(Arrays.toString(a2));
	}
}



class Aaaa{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};   int d = 2;
		

        
        for (int i = 0; i < d; i++) {

           
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
		
          System.out.println(Arrays.toString(arr));
	}
		}


