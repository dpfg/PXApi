package name.aliaksandrch.px.resources;

public class UserResource {
	private final static String RESOURCE_ENDPOINT = "https://api.500px.com/v1/users";
	
	public UserResource(){
		
	}
	
	public UserProfileQuery getUserProfile(){
		return new UserProfileQuery(RESOURCE_ENDPOINT);
	}
}
