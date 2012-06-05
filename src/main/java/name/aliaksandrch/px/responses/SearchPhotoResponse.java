package name.aliaksandrch.px.responses;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import name.aliaksandrch.px.beans.Photo;

public class SearchPhotoResponse implements Serializable{
	private static final long serialVersionUID = -5677817184822116854L;

	@SerializedName("current_page")
	private int currentPage;
	
	@SerializedName("total_pages")
	private int totalPages;
	
	@SerializedName("total_items")
	private int totalItems;
	List<Photo> photos;
	
	public SearchPhotoResponse(){
		
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	
	
}
