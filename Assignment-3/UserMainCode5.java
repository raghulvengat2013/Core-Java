package com.te.core4;
public class UserMainCode5 {
	static int sum;
	public static int sumCommonElements(int[] x, int[] y) {
		for (int i=0;i<x.length;i++) {
		      for (int j=i+1;j<y.length;j++) {
		         if(x[i]==y[j])
		        	 sum+=x[i];
		      }
			}
		return sum;
	}
}
