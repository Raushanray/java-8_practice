package prototype_design_pattern;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Creating object using  Prototype Design ");
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("126.45.6.3");
		networkConnection.loadVeryImportantData();
		System.out.println(networkConnection);
		
		
		
	}

}
