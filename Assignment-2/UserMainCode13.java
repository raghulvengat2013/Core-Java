package com.te.core2;
public class UserMainCode13 {
	static int sum,i=1,j=1,count;
	public static int addNumbers(int num) {
	for(;i<=num;i++) {
		for(;j<=i;j++){
			if(i%j==0)
				count++;
		}
		if(count!=2) {
			sum=sum+i;
		}
		j=1;
		count=0;
	}
	return sum;
}
}
	
