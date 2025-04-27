package arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int sum=0;
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {

				for (int k = i; k <= j; k++) {
					
					integers.add(a[k]);
					sum=sum+a[k];
				}
			}
		}
		System.out.println(sum);
		System.out.println(integers + " ");
	}
}




class SubArraySumWithMaxCountElement {
	public static void main(String[] args) {

		int a[] = { 1, 2, 1, 1, 1, 3, 4 };
		int t = 3;
		int length = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					System.out.print(a[k] + " ");
					sum = sum + a[k];
					if (sum == t) {
						length = Math.max(length, j - i + 1);
					}

				}

			}
		}
		System.out.println(length);
	}
}