package com.te.cre.day4;
public class UserMainCode2 {
	static int sum,rev,add;
	public static int addAndReverse(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>num) {
				sum+=arr[i];
			}
		}
		while(sum>0) {
			rev=sum%10;
			add=add*10+rev;
			sum=sum/10;
		}
		
		return add;
	}
}
