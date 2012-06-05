package name.aliaksandrch.px.responses;

import name.aliaksandrch.px.beans.Profile;

public class UserProfileResponse {
	private Profile user;
	
	public UserProfileResponse(){
		
	}

	public Profile getUser() {
		return user;
	}

	public void setUser(Profile user) {
		this.user = user;
	}
	
	
}
