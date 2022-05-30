package com.te.cre.day4;
public class UserMainCode3 {
static int count;
	public static String addAndReverse(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==2)
				return "True";
			else
				count=0;
		}
		return "False" ;
	}
}
