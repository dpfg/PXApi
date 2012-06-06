package name.aliaksandrch.px.responses;

import java.io.Serializable;

import name.aliaksandrch.px.beans.Profile;

public class UserProfileResponse implements Serializable{
	private static final long serialVersionUID = -6164044328186631630L;
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
