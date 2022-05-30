package com.te.cre.day4;
import com.te.core3.Main;
public class UserMainCode6 {
	static int sum;
	public static String getPerfection(int num) {
		for (int i=1;i<num;i++) {
			if(num%i==0)
				sum+=i;
}
		if(sum==num)
			return "Perfect number";
			else
			return "Not a perfect number";
		}
}
