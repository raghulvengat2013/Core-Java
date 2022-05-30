package com.te.cre.day5;
public class UserMainCode2 {
	public static String checkCharacters(String str) {
	    if(str.charAt(0)==str.charAt((str.length())-1))
		return "Valid";
	    else
	    return "Invalid";
	}
}
