package com.te.core2;
public class UserMainCode14 {
	static int sum=0;
	public static int getSumOfSquaresOfDigits(int num) {
		while(num>0) {
			sum+=(num%10)*(num%10);
			num/=10;
		}
        return sum;
	}
}
