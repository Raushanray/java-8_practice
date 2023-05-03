package java_interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(12);
		marks.add(5);
		marks.add(8);
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);

	}

}
