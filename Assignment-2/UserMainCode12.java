package com.te.core2;
public class UserMainCode12 {
	static int num2=1,num1=0,num3=num1+num2,sum=0;
	public static int getSumOfNfibos(int count) {
	  for(int i=1;i<=count;i++) {
		  sum=sum+num1;
		  num1=num2;
		  num2=num3;
		  num3=num1+num2;
	  }
      	return sum;
	}
}
