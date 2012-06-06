package name.aliaksandrch.px.queries;

import name.aliaksandrch.px.responses.UserProfileResponse;

public class UserProfileQuery implements IQuery{
	private final String endpoint;
	private String id;
	
	public UserProfileQuery(String endpoint){
		this.endpoint = endpoint;
	}
	
	public UserProfileQuery(String id, String endpoint){
		this.endpoint = endpoint;
		this.id = id;
	}

	public String getResourceURI() {
		if(id == null)
			return endpoint;
		else {
			StringBuilder sb = new StringBuilder(endpoint);
			sb.append("/").append(id);
			return sb.toString();
		}
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
