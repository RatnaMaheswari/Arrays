package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SwapZeroToLast {
	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 0, 0, 1, 0, 1 };
		int temp = 0;
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				j++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

class SortZeroOneandTwos {
	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 2, 1, 1, 2 };
		int c0 = 0, c1 = 0, c2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				c0++;
			else if (a[i] == 1)
				c1++;
			else
				c2++;

		}
		for (int i = 0; i < c0; i++) {
			a[i] = 0;
		}
		for (int i = c0; i < c0 + c1; i++) {
			a[i] = 1;

		}
		for (int i = c0 + c1; i < a.length; i++) {
			a[i] = 2;
		}
		System.out.println(Arrays.toString(a));
	}
}



