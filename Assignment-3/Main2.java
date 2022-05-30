package com.te.core4;
import java.util.Scanner;
public class Main2 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
     int num=scan.nextInt();
     int x[]=new int[num];
     for (int i=0;i<x.length;i++) {
		x[i]=scan.nextInt();
	}
     System.out.println(UserMainCode2.getBigDiff(x));
	}
}
