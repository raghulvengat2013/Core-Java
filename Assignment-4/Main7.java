package com.te.cre.day4;
import java.util.Scanner;

import com.te.core.UserMainCode;
public class Main7 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		double num=scan.nextDouble();
        System.out.println(UserMainCode7.findNoDigits(num));
	}
}
