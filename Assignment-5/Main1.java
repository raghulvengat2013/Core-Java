package com.te.cre.day5;

import java.util.Scanner;
public class Main1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the string");
	String str=scan.nextLine();
	System.out.println(UserMainCode1.getMiddleChars(str));
	}
}
