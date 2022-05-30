package com.te.cre.day4;
import java.util.Scanner;
public class Main2 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		int []arr= {10,15,20,25,30,100};
		System.out.println("Enter number");
		int num=scan.nextInt();
		System.out.println(UserMainCode2.addAndReverse(arr,num));
	}
}
