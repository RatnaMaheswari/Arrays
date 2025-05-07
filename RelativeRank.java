package arrays;

import java.util.Arrays;

public class RelativeRank {
public static void main(String[] args) {
	int []score = {10,3,8,9,4};
	 int max=0;
	 for(int i=0;i<score.length;i++) {
		 max=Math.max(max, score[i]);
	 }
	 int count[]=new int[max+1];
	for(int i=0;i<score.length;i++) {
		count[score[i]]=i+1;
	}
	
	String[] string=new String[score.length];
	int rank=1;
	for(int i=max;i>=0;i--) {
		if(count[i]>0) {
			int index=count[i]-1;
			if(rank==1) {
				string[index]="Gold Medal";
			}
			else if(rank ==2) {
				string[index]="Silver medal";
				
			}
			else if(rank==3) {
				string[index]="Bronze medal";
			}
			else {
				string[index]=String.valueOf(rank);
			}
			rank++;
		}
	}
	
	System.out.println(Arrays.toString(string));
}
}