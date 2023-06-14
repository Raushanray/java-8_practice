package prototype_design_pattern;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Creating object using  Prototype Design ");
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("126.45.6.3");
		networkConnection.loadVeryImportantData();
		
		
		//we want new object for network connection
		
				try {
					NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
					
					NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
					
					
					System.out.println(networkConnection);
					
					networkConnection.getDomains().remove(0);
					
					System.out.println(networkConnection);
					
					System.out.println(networkConnection2);
					
					System.out.println(networkConnection3);

				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
		
	}

}
