package com.te.basic1;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode2 {
	static Character f,l;
	public static List<String> matchCharacter(List<String> list1) {
		List<String> list2=new ArrayList<>();
		  for (int i=0;i<list1.size();i++) {
			  f=list1.get(i).charAt(0);
			  l=list1.get(i).charAt(list1.get(i).length()-1); 
			  if(f=='a'||f=='e'||f=='i'||f=='o'||f=='u')
				  if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u') 
			     list2.add(list1.get(i));
	}
		  return list2;
	}
}
