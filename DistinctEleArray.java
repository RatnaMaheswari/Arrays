package arrays;

import java.util.HashMap;
import java.util.Map;

public class DistinctEleArray {
	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 4, 5, 3, 4};
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
				}
			}
			if (flag == false)
				System.out.println(arr[i]);

		}

	}
}




