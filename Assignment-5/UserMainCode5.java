package com.te.cre.day5;

public class UserMainCode5 {
	public static int getElementPosition(String arr [] , String s2) {
		for (int i = 0; i < arr.length; i++) {
			if(s2.equals(arr[i]))
				return i+1;
		}
		return 0;
	}

}
