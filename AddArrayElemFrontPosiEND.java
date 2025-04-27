package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddArrayElemFrontPosiEND {

	/************* insert element in the front ***************/
	public static int[] addEleFront(int arr[], int n) {

		int arr2[] = new int[arr.length + 1];
		int j = 0;
		arr2[0] = n;
		for (int i = 0; i < arr.length; i++) {
			arr2[j + 1] = arr[i];
			j++;
		}
		return arr2;

	}

	/************* insert element in the end ***************/
	public static int[] addEleEnd(int arr[], int n) {

		int arr2[] = new int[arr.length + 1];
		int j = 0;
		arr2[arr2.length - 1] = n;
		for (int i = 0; i < arr.length; i++) {
			arr2[j++] = arr[i];

		}
		return arr2;

	}

	/************* insert element at the perticular position ***************/
	public static int[] addEleAtPsition(int arr[], int n, int position) {

		int arr2[] = new int[arr.length + 1];
		int j=0;
		for(int i=0; i<arr.length;i++) {
			if(position==i) {
				arr2[j++]=n;
			}
			arr2[j++]=arr[i];
		}
			

		
		return arr2;

	}
	

	public static void main(String[] args) {

		int num[] = { 2, 3, 4,5 };
		int num1[] = {1, 2, 3, 4,5 };
		int num2[] = {1, 2, 3, 4,6 };

		int arr1[] = addEleFront(num, 1); // add elem in the front
		System.out.println(Arrays.toString(arr1));

		int arr2[] = addEleEnd(num1, 6); // add ele at end
		System.out.println(Arrays.toString(arr2));

		int arr3[] = addEleAtPsition(num2, 7, 4); // add ele at given position
		System.out.println(Arrays.toString(arr3));

	}
}




