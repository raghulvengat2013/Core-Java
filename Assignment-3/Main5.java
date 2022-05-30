package com.te.core4;
import java.util.Scanner;
public class Main5 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		 System.out.println("Enter the number");
		 int num=scan.nextInt();
	     int x[]=new int[num/2];
	     int y[]=new int[num/2];
	     System.out.println("Enter group1");
	     for(int i=0;i<x.length;i++) {
			x[i]=scan.nextInt();
		}
	     System.out.println("Enter group2");
	     for(int j=0;j<y.length;j++) {
				y[j]=scan.nextInt();
			}
	     System.out.println(UserMainCode5.sumCommonElements(x,y));
	}
}
