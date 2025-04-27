package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindTheNumOnce {
	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 3, 3, 5, 5, 6 };
	

		for (int i = 0; i < a.length; i++) {
			int count = 0;

			
			for (int j = 0; j < a.length; j++) {
				if (a[j] == a[i]) {

					count++;

				}
			}
			if (count == 1)
				System.out.println(a[i]);
		}
	}
}
