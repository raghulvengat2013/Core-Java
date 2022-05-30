package com.te.cre.day4;

import java.util.Scanner;

public class Main3 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		int []arr= {7,3,3,5,5,5,2,3};
		System.out.println("Enter number");
		int num=scan.nextInt();
		System.out.println(UserMainCode3.addAndReverse(arr));
	}
}
