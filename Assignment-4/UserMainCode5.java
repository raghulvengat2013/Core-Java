package com.te.cre.day4;
public class UserMainCode5 {
	public static String searchSequence(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
	    if(arr[i]==1){
	    	if(arr[i+1]==2 && arr[i+2]==3)
	    		return "TRUE";
	    }
		}
    return "FALSE";
	}
}
