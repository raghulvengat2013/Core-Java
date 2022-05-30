package com.te.core2;
import java.util.Scanner;
public class Main12 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter count");
		int count=scanner.nextInt();
      	System.out.println(UserMainCode12.getSumOfNfibos(count));
	}
}
