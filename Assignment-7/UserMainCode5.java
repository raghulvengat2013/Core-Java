package com.te.basic1;
import java.util.ArrayList;
import java.util.List;
public class UserMainCode5 {
	static List<Integer> list3=new ArrayList<>();
	static int count;
	public static  List arrayListSubtractor(List<Integer> list1,List<Integer> list2) {
		list3.addAll(list1);
		list1.removeAll(list2);
		list2.removeAll(list3);
		list1.addAll(list2);
		return list1;
	}
}
