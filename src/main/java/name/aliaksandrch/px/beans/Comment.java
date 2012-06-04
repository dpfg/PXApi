package name.aliaksandrch.px.beans;

import com.google.gson.annotations.SerializedName;

public class Comment {
    @SerializedName("id")
    private String commentId;

    @SerializedName("body")
    private String body;

    @SerializedName("to_whom_user_id")
    private int toWhomUserId;

    @SerializedName("user")
    private User user;


    public Comment() {

    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getToWhomUserId() {
        return toWhomUserId;
    }

    public void setToWhomUserId(int toWhomUserId) {
        this.toWhomUserId = toWhomUserId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
