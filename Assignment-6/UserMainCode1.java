package com.te.core.day6;
public class UserMainCode1 {
	static int sum;
	static char check;
	public static int sumOfDigits(String s) {
		for (int i = 0; i <s.length(); i++) {	
			if(Character.isDigit(s.charAt(i))) {
				int num=Character.getNumericValue(s.charAt(i));
				 sum+=num;
			}
		}
		return sum;
	}
}
