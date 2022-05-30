package com.te.core;
import java.util.Scanner;
public class Main4 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int num= s.nextInt();
       num=UserMainCode4.getUnique(num);
	if(num==1)
		System.out.println("Unique");
	else
		System.out.println("Not Unique");
	}
}
