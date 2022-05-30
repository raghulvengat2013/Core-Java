package com.te.core2;
public class UserMainCode15 {
	static int sum;
	public static int getLuckySum(int num1,int num2,int num3) {
		sum=num1+num2+num3;
		if(num1==13)
			sum=sum-num1-num2;
     	else if(num2==13)
     		sum=sum-num2-num3;
     	else if(num3==13)
     		sum=sum-num3;
     	if(sum>0)
    return sum;
     	else
     return 0;
	}
}
