package name.aliaksandrch.px.responses;

import com.google.gson.annotations.SerializedName;
import name.aliaksandrch.px.beans.Photo;

import java.io.Serializable;
import java.util.List;

public class PhotosResponse implements Serializable{
    @SerializedName("feature")
    private String feature;

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName("total_page")
    private int totalPages;

    @SerializedName("total_items")
    private int totalItems;

    @SerializedName("photos")
    private List<Photo> photos;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
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
