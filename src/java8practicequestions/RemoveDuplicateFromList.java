package java8practicequestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("ABCD");
		list.add("ABCE");
		list.add("ABCD");
		list.add("ABC");
		list.add("ABCE");
		list.add("ABCF");
		System.out.println("with duplicate : " + list);
		Set<String> uniqueSet = new HashSet<String>(list);
		list.clear();
		list.addAll(uniqueSet);
//		Object[] st = list.toArray();
//		for (Object object : st) {
//			if (list.indexOf(object) != list.lastIndexOf(object)) {
//				list.remove(list.lastIndexOf(object));
//			}
//			
//		}
		System.out.println("List with duplicates removed :" + list);
	}

}
