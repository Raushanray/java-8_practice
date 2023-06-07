package read.remove.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException{
		Test testObj = new Test();
		try {
			
			System.out.println("Read data from file word by word :- ");
			String[] strArray = testObj.readLines("D:\\notes\\demo.txt");
			System.out.println(Arrays.toString(strArray));
			testObj.findRemoveduplicate(strArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	private String[] readLines(String fileName) throws IOException {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<String> lines = new ArrayList<String>();
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			lines.add(line);
		}
		bufferedReader.close();

		return lines.toArray(new String[lines.size()]);
	}

	public void findRemoveduplicate(String[] arr) {
		String[] strArr = arr;
	    String strValue = Arrays.toString(strArr);
	    //Replace whiteSpace with nothings
//	     strValue.replaceAll("\\R", "");
	    //to split based on many delimiters (whiteSpeace, dot,[,] )
	    String[] strFinal = strValue.split("\\s|\\.|\\[|\\]|\\ ,");
	    
	    //to count occurence of each String in array through map
	    LinkedHashMap<String, Integer> strMap = new LinkedHashMap<String, Integer>();
	    for (String str : strFinal) {
	    	if (strMap.containsKey(str)) 
				strMap.put(str, (strMap.get(str)+1));
	    	else 
	    		strMap.put(str, 1);
			
		}
	    System.out.println("count of each string :- ");
	    System.out.println(strMap);
	    
	    
	    //to delete the duplicate from array of string.
	   Set<String> set= new LinkedHashSet<String>(Arrays.asList(strFinal));
	   System.out.println("Array without duplicate :- ");
	   System.out.println(set);
	   Iterator<String> iter = set.iterator();
	   while (iter.hasNext()) {
		Object obj = iter.next();
		System.out.println(obj);
	}

	}

}
