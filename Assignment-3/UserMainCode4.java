package com.te.core4;
public class UserMainCode4 {
	static int count;
	static double sum,mean;
	public static double averageElements(int[] x) {
		for (int i=1;i<x.length;i++) {
	      for (int j=1;j<=i;j++) {
	    	  if(i%j==0)
	    		  count++;
	      }
		        	if(count==2) {
		        		sum+=x[i];
		        		mean++;
		        	}
		        	count=0;  	
		}
		return sum/mean;
	}
}

