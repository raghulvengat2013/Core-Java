package com.te.cre.day4;
import java.util.ArrayList;
import java.util.Iterator;
public class UserMainCode1 {
	static int count,i;
	public static void main(String[] args) {
		ArrayList<Integer> ref=new ArrayList<Integer>();
		int a[]={1,10,20,10,2};
		
		for (int i=0;i<a.length;i++) {
			if(a[i]%10!=0) {
					ref.add(a[i]);
			}
			}
		
	    for(int s:ref) {
	    	System.out.println(s);
	    }
		}
}

