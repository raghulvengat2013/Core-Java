package com.te.core.day6;
import java.util.Scanner;
public class Main2 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the string");
		String s1=scan.next();
	    System.out.println("Enter the character");
	    char c1=scan.next().charAt(0);
	    System.out.println(UserMainCode2.removeCharacter(s1,c1));
	}
}
