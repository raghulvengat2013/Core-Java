package com.te.core4;
import java.util.Scanner;
public class Main3 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the EVEN number");
		int num=scan.nextInt();
		if(num%2!=0) 
		{
		System.out.println("You entered odd number");
		main(null);
		}
		
		else 
		{
	     int x[]=new int[num];
	     System.out.println("Enter array");
	     for (int i=0;i<x.length;i++) {
			x[i]=scan.nextInt();
		}
	     System.out.println(UserMainCode3.checkLargestAmongCorner(x));
		}
		}
}

