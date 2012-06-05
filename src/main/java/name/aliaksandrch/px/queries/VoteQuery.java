package name.aliaksandrch.px.queries;

import name.aliaksandrch.px.responses.PhotoResponse;

public class VoteQuery implements IQuery {
	private static final String VOTE_ENDPOINT = "vote";
	private int id;
	private int vote;
	private final String resource;
	
	public VoteQuery(int id, int vote, String resource){
		this.id = id;
		this.vote = vote;
		this.resource = resource;
	}

	public String getResourceURI() {
		StringBuilder sb = new StringBuilder(resource);
		sb.append("/").append(id).append("/").append(VOTE_ENDPOINT)
			.append("?vote=").append(vote).append("&id=").append(id);
		return sb.toString();
	}

	public String getMethod() {
		return POST_METHOD;
	}

	public String getBody() {
		return "";
	}

	public Class getResponseClass() {
		return PhotoResponse.class;
	}

	public int getId() {
		return id;
	}

	public int getVote() {
		return vote;
	}

	public VoteQuery setId(int id) {
		this.id = id;
		return this;
	}

	public VoteQuery setVote(int vote) {
		this.vote = vote;
		return this;
	}
	
	

}
