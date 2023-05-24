package design_pattern.singleton;

public enum Samosa {
	
	INSTANCE;
	
//	private static Samosa samosa;
	
	//constructor 
//	private Samosa() {
//		if(samosa != null) {
//			throw new RuntimeException("you are trying to break the singleton design pattern..");
//		}
//		
//	}
	//Lazy way of creating singleton object
//	public synchronized static Samosa getSamosa() { //this is method synchronization
//		//create object of this class
//		if (samosa == null) {
//			 samosa = new Samosa();
//		}
//		return samosa;
//		
//	} //this is not good ways..
	
	
//	public  static Samosa getSamosa() { 
//		//create object of this class
//		if (samosa == null) {
//			synchronized (Samosa.class) {
//				if (samosa == null) {
//					 samosa = new Samosa();
//				}
//			}
//		}
//		return samosa;
//		
//	}
	
	// you can also add some method for testing
	public void test() {
		System.out.println("testing......");
	}
	
}


/*
 * 
 * 1. constructor private
 * 
 * 2. object create with the help of method
 * 
 * create fields to store the object is private 
 * 
 */

/* 
 * PROBLEM
 * when you have only one tread then its work perfectly. here thread safety is not concerned.
 * but when u have multiple thread the it create problem.
 * 
 * for solving this problem u can use synchronized key word on getSamosa() method..but here one more problem it synchronized all lines
 * for getting the object till executed all lines of code in this method. this is not good way. because when 1-thread is    
 * use this method others are waiting..
 * 
 * 
 * for solving this problem we can use block synchronization.
 */
