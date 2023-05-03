package java_interview;

public class Student {
	int x =25;

	
	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		return st.x == this.x;
		
	}
	
	

}
