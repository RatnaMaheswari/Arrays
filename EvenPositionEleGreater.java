package arrays;

import java.util.Arrays;

public class EvenPositionEleGreater {
	 public static void main(String[] args) {
		int arr[] = {1,4,5,2,7};
		for(int i=1;i<arr.length;i++) {
			if (i % 2 == 0)
            {
                if (arr[i] > arr[i - 1])
                {
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
            }
            else
            {
                if (arr[i] < arr[i - 1])
                {
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
            }
		}
	System.out.println(Arrays.toString(arr));

	}
}

