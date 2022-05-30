package com.te.cre.day4;
public class UserMainCode8 {
	public static int getLargestSpan(int[] arr, int num) {
			int gap=0;
			for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
			if(arr[i]==arr[j])
				gap=j+1;
				}
			}
			return gap;	
	}
}
