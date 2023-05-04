package com.java_8.question.using.stream.function;
//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
public class Convert_A_List_Of_Obj_Into_Map {
	public static void main(String[] args) {
		List<Notes> noteLst = new ArrayList<>();
	    noteLst.add(new Notes(1, "note1", 11));
	    noteLst.add(new Notes(2, "note1", 22));
	    noteLst.add(new Notes(3, "note3", 33));
	    noteLst.add(new Notes(4, "note4", 44));
	    noteLst.add(new Notes(5, "note3", 55));

	    noteLst.add(new Notes(6, "note4", 66));
		
	    Map<String, Long> notesRecords = noteLst.stream()
                                                .sorted(Comparator
                                                .comparingLong(Notes::getId)
                                                .reversed())
                                                .collect(Collectors.toMap(Notes :: getName, Notes :: getId,(oldValue, newValue) -> oldValue, LinkedHashMap :: new));
        
	    
	 // consider old value 44 for dupilcate key
	 // it keeps order
	         System.out.println("Notes : " + notesRecords);
	}

}
class Notes{
	private long id;
	private String name;
    private int value;
    
	public Notes(long id, String name, int value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setAge(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Notes [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
    
    
    
    
}
