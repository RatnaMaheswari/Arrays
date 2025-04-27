package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LeadersInArrayElement {
	public static void main(String[] args) {
		int a[] = { 10, 22, 12, 3, 1, 6 };
		Set<Integer> list = new TreeSet();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					list.add(a[j]);
				}
			}
		}
		System.out.println(list);

	}
}

class AnotherSolution {
	public static void main(String[] args) {
		int a[] = { 10, 22, 12, 3, 0, 6 };
		Set<Integer> list = new TreeSet();
		int max = Integer.MIN_VALUE;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] > max) {
				max = a[i];
			}
			max = Math.max(max, a[i]);
			list.add(max);
		}
		System.out.println(list);
	}
}

class Practice {
	public static void main(String[] args) {
		int arr[] = { 10, 22, 12, 3, 1, 6 };

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					flag = true;
				}
			}
			if (flag == false)
				System.out.println(arr[i]);
		}

	}
}
