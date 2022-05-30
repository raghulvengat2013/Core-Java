package com.te.cre.day5;
public class UserMainCode3 {
	public static String formNewWors(String str,int num) {
		return str.substring(0,num) + str.substring(str.length()-num, str.length());
	}
}
