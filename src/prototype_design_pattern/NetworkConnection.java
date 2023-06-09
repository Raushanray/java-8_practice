package prototype_design_pattern;

public class NetworkConnection implements Cloneable {
	
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
	
	public void loadVeryImportantData() throws InterruptedException  {
		this.importantData = " very very important data";
		Thread.sleep(5000);
		//it will take 5 minutes
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}