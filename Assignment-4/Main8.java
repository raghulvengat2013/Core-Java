package com.te.cre.day4;
import java.util.Scanner;
public class Main8 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number");
		int num=scan.nextInt();
		int []arr= new int[num];
		for (int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(UserMainCode8.getLargestSpan(arr,num));
	}
}
