package com.te.core2;
import java.util.Iterator;
import java.util.Scanner;
public class UserMainCode11 {
	static int rem,rev=0,add,num;
	public static int addPalindromes(int num1,int num2) {
	 for(int i=num1;i<=num2;i++) {
		    num=i;
		   while(num>0) {
				rem=num%10;
			    rev=rev*10+rem;
				num=num/10;
			}
		   if(rev==i) 
			   add=add+rev;
			   rev=0;
	 }
	 if(add!=0)
	 return add;
	 else
	 return 0;
}
}
