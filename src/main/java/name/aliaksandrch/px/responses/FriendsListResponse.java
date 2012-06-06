package name.aliaksandrch.px.responses;

import java.util.List;

import name.aliaksandrch.px.beans.User;

import com.google.gson.annotations.SerializedName;

public class FriendsListResponse {
	@SerializedName("friends_count")
	private int friendsCount;
	
	@SerializedName("friends_pages")
	private int friendsPages;
	
	private int page;
	private List<User> friends;
	
	public FriendsListResponse(){
		
	}

	public int getFriendsCount() {
		return friendsCount;
	}

	public void setFriendsCount(int friendsCount) {
		this.friendsCount = friendsCount;
	}

	public int getFriendsPages() {
		return friendsPages;
	}

	public void setFriendsPages(int friendsPages) {
		this.friendsPages = friendsPages;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	
	
}
