package com.te.cre.day4;

import java.util.StringTokenizer;

public class UserMainCode7 {
	public static String  findNoDigits(double num) {
		int n1=0,n2=0;
		String s=String.valueOf(num);
		StringTokenizer t=new StringTokenizer(s,".");
		String s1=t.nextToken();
		String s2=t.nextToken();
		n1=s1.length();
		n2=s2.length();
		if(s1.charAt(0)=='0')
		n1=s1.length()-1;
		if(n2!=1)
		if(s2.charAt(s2.length()-1)=='0')
		n2=s2.length()-1;
		String s3=String.valueOf(n1)+":"+String.valueOf(n2);
		return s3;
	}
}
