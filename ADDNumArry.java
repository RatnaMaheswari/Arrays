package arrays;

import java.util.Arrays;

public class ADDNumArry {
	public int[] twoNums(int arr[], int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(i + " " + j);

				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };

		ADDNumArry addNumArry = new ADDNumArry();
		addNumArry.twoNums(num, 6);
	}
}












