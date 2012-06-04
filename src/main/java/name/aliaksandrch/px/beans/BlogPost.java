package name.aliaksandrch.px.beans;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class BlogPost implements Serializable{
	private static final long serialVersionUID = -2925137840300287775L;
	
	private int id;
	private String title;
	private User user;
	
	@SerializedName("created_at")
	private String createdAt;
	
	public BlogPost(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
