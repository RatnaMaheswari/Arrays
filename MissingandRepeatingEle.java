package arrays;
//s-sn
	//s2-s2N
public class MissingandRepeatingEle {
public static void main(String[] args) {
	int arr[] = {3, 1, 3,4,};
	
	  long n= arr.length;
	  long sn=(n*(n+1))/2;
	  long s2N=(n*(n+1)*(2*n+1))/6;
	  
	  long sum=0;long sum2=0;
	  for(int i=0;i<arr.length;i++) {
		  sum=sum+arr[i];
		  sum2=sum2+(long)arr[i]*(long)arr[i];
	  }
	  long num1=sum-sn;//x-y
	  long num2=sum2-s2N;//x^2-y^2
	  num2=num2/num1; //X+Y
	  
	  long x=(num1+num2)/2;
	  long y=x-num1;
	  System.out.println("Repeating number:"+(int)x+" ||  "+"Missing Number:"+(int)y);
}
}
