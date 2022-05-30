package com.te.basic1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main3 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		System.out.println("Enter the number");
		int num=scan.nextInt();
		for (int x=0;x<num;x++) {
			list1.add(scan.nextInt());
		}
		list1=UserMainCode3.removeMultiplesOfThree(list1);
	    for(Integer s:list1){
		 System.out.println(s);
	    }
	}
}
