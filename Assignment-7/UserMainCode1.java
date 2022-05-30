package com.te.basic1;
import java.util.ArrayList;
import java.util.List;
public class UserMainCode1 {
	static List<Integer> list3=new ArrayList<>();
	public static List<Integer> sortMergedArrayList(List<Integer> list1) {
	        for (int m=0;m<list1.size();m++) {
			 if (m==2||m==6||m==8)
				 list3.add(list1.get(m));
			}
			return list3;
	}
}
