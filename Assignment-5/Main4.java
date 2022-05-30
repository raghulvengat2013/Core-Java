package com.te.cre.day5;
import java.util.Scanner;
public class Main4 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the string");
		String s1=scan.nextLine();
		System.out.println(UserMainCode4.removeEvenVowels(s1));
	}
}
