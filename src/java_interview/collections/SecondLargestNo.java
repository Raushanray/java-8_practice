package java_interview.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;;

public class SecondLargestNo {
	public static void main(String[] args) {
		List<Integer> numbers =  Arrays.asList(12,36,14,25,15,2,1,45);
		ArrayList<Integer> arrLst = new ArrayList<Integer>(numbers);;
		System.out.println(arrLst);
		int  maxNum = Collections.max(arrLst);
		int indexOf = arrLst.indexOf(maxNum);
		System.out.println(indexOf);
		arrLst.remove(indexOf);
		System.out.println(arrLst);
		int maxNum2 = Collections.max(arrLst);
		System.out.println(maxNum2);
		
		

	}

}
