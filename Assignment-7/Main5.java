package com.te.basic1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main5 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		System.out.println("Enter the list-1  5no");
        for (int x=0;x<3;x++) {
            list1.add(scan.nextInt());
		}
        System.out.println("Enter the list-2 5no");
        for (int y=0;y<3;y++) {
            list2.add(scan.nextInt());
        }
        Collections.sort(list1);
       list1=UserMainCode5.arrayListSubtractor(list1,list2);
       System.out.println("hi");
        for(Integer i:list1) {
        	System.out.println(i);
        }
	}
}
