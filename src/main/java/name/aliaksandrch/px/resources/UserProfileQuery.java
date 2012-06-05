package name.aliaksandrch.px.resources;

import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.responses.UserProfileResponse;

public class UserProfileQuery implements IQuery{
	private final String endpoint;
	
	public UserProfileQuery(String endpoint){
		this.endpoint = endpoint;
	}

	public String getResourceURI() {
		return endpoint;
	}

	public String getMethod() {
		return GET_METHOD;
	}

	public String getBody() {
		return null;
	}

	public Class getResponseClass() {
		return UserProfileResponse.class;
	}

}
