package com.te.basic1;
import java.util.Arrays;
import java.util.List;
import javax.xml.soap.SAAJResult;
public class UserMainCode4 {
	public static String[] convertToStringArray(List<String> list1) {
		String arr[]= new String[list1.size()];
		list1.toArray(arr);
		Arrays.sort(arr);
		return arr;
	}
}
