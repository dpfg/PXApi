package name.aliaksandrch.px.resources;

import name.aliaksandrch.px.queries.UserFriendsQuery;
import name.aliaksandrch.px.queries.UserProfileQuery;

public class UserResource {
	private final static String RESOURCE_ENDPOINT = "https://api.500px.com/v1/users";
	
	public UserResource(){
		
	}
	
	public UserProfileQuery getUserProfile(){
		return new UserProfileQuery(RESOURCE_ENDPOINT);
	}
	
	public UserProfileQuery getUserProfile(String identifier){
		return new UserProfileQuery(identifier, RESOURCE_ENDPOINT);
	}
	
	public UserFriendsQuery getUserFriendsList(String id){
		return new UserFriendsQuery(id, RESOURCE_ENDPOINT);
	}
}
