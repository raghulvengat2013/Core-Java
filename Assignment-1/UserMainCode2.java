package com.te.core;
import java.util.*;
public class UserMainCode2{
	static Scanner s = new Scanner(System.in);
    static int rev,count;
	public static int reverseNumber(){	
		int num= s.nextInt();
		while(num>0) {
			if(num%10==0)
				count++;
			rev=(num%10)+rev*10;
			num/=10;
		}
			return rev;
			}
}