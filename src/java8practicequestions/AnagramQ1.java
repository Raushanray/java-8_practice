package java8practicequestions;

import java.util.Arrays;

public class AnagramQ1 {
	public static void main(String[] args) {
		System.out.println(anagramLogic("this is very good boy", "yob doog revy sI iths"));
	}
	
	static boolean anagramLogic (String fw,String sw) {
		fw = fw.toLowerCase();
		sw =sw.toLowerCase();
		
		char[] w1 = fw.replaceAll("[^a-zA-Z0-9]", " ").toCharArray();
		char[] w2 = sw.replaceAll("[\\s]", " ").toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		return Arrays.equals(w1, w2);
		
	}
}
