package builder_design_pattern;

public class Main {
	public static void main(String[] args) {
		User user = new User.UserBuilder()
		        .setUserId("UserId100")
		        .setUserName("Raushan Ranjan")
		        .setEmailId("raushanku@gmail.com")
		        .build();
		System.out.println(user);
		
		User user2 = User.UserBuilder
		    .builder()
		    .setUserId("UserId101")
	        .setUserName("Ravi Ranjan")
	        .setEmailId("raviranjan@gmail.com")
	        .build();
		System.out.println(user2);
	}

}
