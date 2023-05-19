package design_pattern.singleton;

public class Main {
	public static void main(String[] args) {
		//Lazy way of creating singleton object
		Samosa samosa1 = Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa2.hashCode());
		
		//Eager way of creating singleton object
		System.out.println(Jalebi.getJalebi().hashCode());
		System.out.println(Jalebi.getJalebi().hashCode());
	}

}
