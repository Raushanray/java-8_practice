package prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
	
	private String ip;
	private String importantData;
	private List<String> domains = new ArrayList<>();
	
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	
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
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + getDomains() + "]";
	}
	public void loadVeryImportantData() throws InterruptedException  {
		this.importantData = " very very important data";
		domains.add("www.google.com");
		domains.add("www.lcdw.com");
		domains.add("www.learncodewithdurgesh.com");
		domains.add("www.facebook.com");
		Thread.sleep(5000);
		//it will take 5 minutes
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	

}
