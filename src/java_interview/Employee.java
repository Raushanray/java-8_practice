package java_interview;

public class Employee{
	
	String eId;
	String name;
	String dept;
	int age;
	
	
	
	public Employee(String eId, String name, String dept, int age) {
		super();
		this.eId = eId;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}

	
	
	

}
