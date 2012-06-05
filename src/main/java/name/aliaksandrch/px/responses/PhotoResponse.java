package name.aliaksandrch.px.responses;

import com.google.gson.annotations.SerializedName;
import name.aliaksandrch.px.beans.Comment;
import name.aliaksandrch.px.beans.PhotoExtended;

import java.io.Serializable;
import java.util.List;

/**
 * Date: 11/25/11
 *
 * @Author Aliaksandr Chaiko
 */
public class PhotoResponse implements Serializable{
    @SerializedName("photo")
    private PhotoExtended photo;

    @SerializedName("comments")
    private List<Comment> comments;

    public PhotoResponse() {

    }

    public PhotoExtended getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoExtended photo) {
        this.photo = photo;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
