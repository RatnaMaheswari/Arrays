package arrays;

public class MaximumSubArraySum {
	public static void main(String[] args) {
		int arr[] = { -2, 1, -1, 1, 7 };

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {

				// for (int k = i; k <= j; k++) {
				sum = sum + arr[j];
				max = Math.max(sum, max);
			}

		}
		System.out.println(max);
	}
}

class KadanesAlgToFindMaxNumInSubArray {
	public static void main(String[] args) {
		int arr[] = { -2, 1, -1, 1, 7 };
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
			if (sum > max) {
				max = sum;
			}
			if (sum < 0)
             sum = 0;
		}
		System.out.println(max);

	}
}