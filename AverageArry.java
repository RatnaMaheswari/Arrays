package arrays;

public class AverageArry {
	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 9, 6 };
		int avg = 0;int sum=0;
		for (int i = 0; i < arr.length; i++) {
			
			sum=sum+arr[i];
			avg=sum/arr.length;

		}
		System.out.println(avg);
	}
}
