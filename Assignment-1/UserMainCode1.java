package com.te.core;
import java.util.*;
public class UserMainCode1{
	static Scanner s = new Scanner(System.in);
    static int sq;
	public static int sumOfSquaresOfEvenDigits(){
		int num= s.nextInt();
		while(num>0) {
			if((num%10)%2==0)
			sq+=(num%10)*(num%10);
			num/=10;
		}
			return sq;
	}
}

