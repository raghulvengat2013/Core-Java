package com.te.cre.day4;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
public class Main4 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		int []arr= {52,52,81,84,60,88};
		System.out.println("Enter number");
		int num=scan.nextInt();
		Arrays.sort(arr);
		System.out.println(UserMainCode4.calculateMedian(arr,num));
	}
}
