package com.te.cre.day5;
public class UserMainCode1 {
	static StringBuffer sb=new StringBuffer();
	public static String getMiddleChars(String str) {
		return str.substring((str.length()/2)-1,(str.length()/2)+1);
	}
}
