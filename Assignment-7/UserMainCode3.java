package com.te.basic1;
import java.util.ArrayList;
import java.util.List;
public class UserMainCode3 {
      static List<Integer> list2=new ArrayList();
	public static List<Integer> removeMultiplesOfThree(List<Integer> list1) {
		for (int i=0;i<list1.size();i++) {
			if((i+1)%3!=0)
				list2.add(list1.get(i));
		}
		return list2;
	}
}
