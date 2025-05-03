package arrays;

import java.util.Arrays;

public class Find3LargestNums {
	public static void main(String[] args) {
		int nums[] = { 1,5,20,10,30 };
		 Integer maxNum=null;
	        Integer secondMaxNum=null;
	        Integer thirdMaxNum=null;
	        

	        for(Integer num:nums){
	            if(num.equals(maxNum)||num.equals(secondMaxNum)|| num.equals(thirdMaxNum)) {
	            continue;
	        }
	            if(maxNum==null|| num>maxNum){
	                thirdMaxNum=secondMaxNum;
	                secondMaxNum=maxNum;
	                maxNum=num;
	            }
	            else if(secondMaxNum==0 || num>secondMaxNum){
	                 thirdMaxNum=secondMaxNum;
	                  secondMaxNum=num;
	            }
	            else if(thirdMaxNum==0 || num>thirdMaxNum){
	                thirdMaxNum=num;
	            }
	        }
	        if(thirdMaxNum==0){
	            System.out.println(maxNum);
	        }
	        System.out.println(thirdMaxNum);
	}
}
