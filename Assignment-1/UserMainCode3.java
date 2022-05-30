package com.te.core;
import java.util.*;
public class UserMainCode3 {
	static Scanner s = new Scanner(System.in);
	static int count;
	public static int countSeven(){
			int num= s.nextInt();
			while(num>0) {
				if(num%10==7)
					++count;
				num/=10;
			}
				return count;
	}
}
