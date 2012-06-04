package name.aliaksandrch.px.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Photo implements Serializable{
    private static final long serialVersionUID = 2310640791687072782L;
    
    @SerializedName("id")
    private int photoId;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("category")
    private int category;

    @SerializedName("image_url")
    private String imageURL;

    @SerializedName("votes_count")
    private int votesCount;

    @SerializedName("favorites_count")
    private int favoritesCount;

    @SerializedName("comments_count")
    private int commentsCount;

    @SerializedName("user")
    private User user;

    public Photo(){
        
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getVotesCount() {
        return votesCount;
    }

    public void setVotesCount(int votesCount) {
        this.votesCount = votesCount;
    }

    public int getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(int favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Photo{" + "photoId=" + photoId +" imageURL=" + imageURL +'}';
    }
}
