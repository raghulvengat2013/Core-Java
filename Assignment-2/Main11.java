package com.te.core2;
import java.util.Scanner;
import com.te.core.UserMainCode;
public class Main11 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter 1st num");
		int num1=s.nextInt();
		System.out.println("Enter 2st num");
		int num2=s.nextInt();
		System.out.println(UserMainCode11.addPalindromes(num1,num2));
	}
}
