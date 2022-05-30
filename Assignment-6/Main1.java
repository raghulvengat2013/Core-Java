package com.te.core.day6;
import java.util.Scanner;
public class Main1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=scan.next();
		System.out.println(UserMainCode1.sumOfDigits(s));
	}
}

