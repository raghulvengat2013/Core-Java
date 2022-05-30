package com.te.cre.day5;
import java.util.Arrays;
import java.util.Scanner;
public class Main5 {
	static Scanner scan=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Enter the number");
			int num=scan.nextInt();
			System.out.println("Enter the string");
			String s1[]=new String[num];
			for (int i = 0; i <num; i++) {
				s1[i]=scan.next();
			}		
			Arrays.sort(s1);
			for (int i = 0; i <num; i++) {
				System.out.println(s1[i]);
			}		
			
			String s2=scan.next();
			System.out.println(UserMainCode5.getElementPosition(s1,s2));
		}
}
