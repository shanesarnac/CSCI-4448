
public class UserUtility {
	
	public String createUsername(String firstName, String lastName) {
		String username = firstName.substring(0,3);
		username += lastName.substring(lastName.length() - 3, lastName.length());
		return username;
	}
}
