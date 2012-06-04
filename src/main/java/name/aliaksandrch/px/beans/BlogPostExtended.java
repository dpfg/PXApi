package name.aliaksandrch.px.beans;

import java.util.List;

public class BlogPostExtended extends BlogPost {
	private static final long serialVersionUID = -1169214586123877485L;
	
	private String longitude;
	private String latitude;
	private String body;
	private String tags;
	List<Photo> photos;
	
	public BlogPostExtended(){
		
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
