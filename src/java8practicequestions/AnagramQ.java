package java8practicequestions;

import java.util.Arrays;

public class AnagramQ {
	public static void main(String[] args) {
		String str = "SILENT";
		String str1 = "LISTEN";
		
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		if (ch.length != ch1.length) {
			System.out.println("not anagram");
			System.exit(0);
		}
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		for (int i = 0; i < ch1.length; i++) {
			if (ch[i] != ch1[i]) {
				System.out.println("not anagram");
				System.exit(0);
			}
		}
		System.out.println("anaram");
	}

}
