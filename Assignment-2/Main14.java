package com.te.core2;
import java.util.Scanner;
public class Main14 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter no");
		int num= scanner.nextInt();
		System.out.println(UserMainCode14.getSumOfSquaresOfDigits(num));
	}
}
