package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RerrangePositivesandNegatives {
	public static void main(String[] args) {
		int a[] = { 3, 1, -2, -5, 2, -4 };
		int j = 0;
		int k = 0;
		int b[] = new int[a.length / 2];
		int c[] = new int[a.length / 2];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				b[j++] = a[i];
			else if (a[i] < 0)
				c[k++] = a[i];
		}
		for (int i = 0; i < a.length/2; i++) {
			a[2 * i] = b[i];
			a[2 * i + 1] = c[i];
		}
		System.out.println(Arrays.toString(a));
	}
}
