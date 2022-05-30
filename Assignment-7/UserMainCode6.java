package com.te.basic1;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode6 {
	static int j;
	static List<Integer> list3=new ArrayList<>();
public static List<Integer> generateOddEvenList(List<Integer> list1, List<Integer> list2) {
	for(int i=0;i<list1.size();i++) {
		if(i%2==0)
		list3.add(list1.get(i));
		else
		if(i%2!=0)
	    list3.add(list2.get(i));
	}
	return list3;
}
}