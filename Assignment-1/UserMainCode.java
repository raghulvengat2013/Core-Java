package com.te.core;
import java.util.*;
public class UserMainCode {
	static Scanner s = new Scanner(System.in);
    static int odd;
	public static int checkSum(){
		int num= s.nextInt();
		while(num>0) {
			if((num%10)%2!=0)
				odd+=num%10;
			num/=10;
		}
		if(odd%2!=0)
			return 1;
		    return -1; 
	}
}
