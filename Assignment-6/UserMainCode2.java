package com.te.core.day6;
public class UserMainCode2 {
	static String str="";
	public static String removeCharacter(String s1 ,char c1) {
		StringBuffer sbuffer = new StringBuffer();
		for (int i=0;i<s1.length();i++) {
			if(c1!=s1.charAt(i))
				sbuffer.append(s1.charAt(i));
		}
		
		return sbuffer.toString();
	}
}
