package com.te.core;
public class UserMainCode4 {
	static int count;
	public static int getUnique(int num) {
		String s=Integer.toString(num);	
        for (int i=0;i<s.length();i++) {
        for (int j=1+i;j<s.length();j++) {
        		if(s.charAt(i)==s.charAt(j))
        			{count=1;
        	        break;}}
        if(count==1)
        break;
        	}
        if(count==0)
        return 1;
        else
        return -1;
	}
}
