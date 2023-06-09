package prototype_design_pattern;

public class NetworkConnection {
	
	private String ip;
	private String importantData;
	
	public String getIp() {
		return ip;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	
	@Override
	public String toString() {
		return "NetworkConnection [ip = " + ip + ", importantData = " + importantData + "]";
	}
	
	public void loadVeryImportantData()  {
		this.importantData = " very very important data";
		
		//it will take 5 minutes
	}
	
	

}
