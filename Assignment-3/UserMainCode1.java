package com.te.core4;
public class UserMainCode1 {
	static int add=0;
	public static int getSumOfPower(int[] x) {
		for (int i=0; i<x.length; i++) {
			 add+=(int)Math.pow(x[i],i);
		}
		return add;
	}
}
