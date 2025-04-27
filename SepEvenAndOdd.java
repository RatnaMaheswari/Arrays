package arrays;

import java.util.Arrays;

public class SepEvenAndOdd {
	public static void main(String[] args) {
		int arr[] = {8, 1, 5, 6, 2, 3, 4 };
		int temp = 0;
		int j = -1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				j++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}









