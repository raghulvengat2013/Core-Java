package com.te.cre.day4;
import java.util.Scanner;
public class Main9 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int limits;
		System.out.println("Enter Array Limits");
        limits=scan.nextInt();
    	int[] a=new int[limits];
        for(int i=0;i<limits;i++) {
        			a[i]=scan.nextInt();
        }
       int num= UserMainCode9.sumElements(a);
       System.out.println(num);
	}
}
