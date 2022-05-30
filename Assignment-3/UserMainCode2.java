package com.te.core4;
public class UserMainCode2 {
	static int max,min;
	public static int getBigDiff(int[] x) {
		max=x[0];min=x[0];
		for (int i=1;i<x.length;i++) {
			if(x[i]>max) 
				max=x[i];
			else if(x[i]<max)
				min=x[i];
		}
		System.out.println(max);
		System.out.println(min);
return max-min;
	}
}
