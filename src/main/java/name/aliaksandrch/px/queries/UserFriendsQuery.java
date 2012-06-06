package name.aliaksandrch.px.queries;

import name.aliaksandrch.px.responses.FriendsListResponse;

public class UserFriendsQuery implements IQuery{
	private final String endpoint;
	private String id;
	private int page;

	public UserFriendsQuery(String id, String resourceEndpoint) {
		this.endpoint = resourceEndpoint;
		this.id = id;
	}

	public String getResourceURI() {
		StringBuilder sb = new StringBuilder(endpoint);
		sb.append("/").append(id).append("/").append("friends");
		return sb.toString();
	}

	public String getMethod() {
		return GET_METHOD;
	}

	public String getBody() {
		return null;
	}

	public Class getResponseClass() {
		return FriendsListResponse.class;
	}

	public String getId() {
		return id;
	}

	public UserFriendsQuery setId(String id) {
		this.id = id;
		return this;
	}

	public int getPage() {
		return page;
	}

	public UserFriendsQuery setPage(int page) {
		this.page = page;
		return this;
	}
	
	
}
