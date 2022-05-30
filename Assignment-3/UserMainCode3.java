package com.te.core4;
public class UserMainCode3 {
    static int checkLargestAmongCorner(int x[]) {
    	int a=x[0],b=x[x.length-1],c=x[x.length/2];
    	return  (a>b)&&(a>c)?a:b>c?b:c;
	}
}
