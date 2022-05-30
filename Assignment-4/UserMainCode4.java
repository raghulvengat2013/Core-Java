package com.te.cre.day4;
public class UserMainCode4 {
	public static int calculateMedian(int[] arr, int num) {
			if(num%2!=0)
				return arr[num/2];
			if(num%2==0)
				return (arr[num/2] + arr[num/2 - 1])/2;
			return 0;
	}
}
