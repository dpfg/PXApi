package name.aliaksandrch.px.queries;

import name.aliaksandrch.px.responses.PhotoResponse;

import static name.aliaksandrch.px.utils.StringUtils.addFirstParameter;
import static name.aliaksandrch.px.utils.StringUtils.addParameter;

/**
 * Date: 11/25/11
 *
 * @Author Aliaksandr Chaiko
 */
public class PhotoQuery implements IQuery {

    /**
     * Numerical size of the image to link to, 1 being the smallest and 4 being the largest.
     */
    public static class ImageSizes {
        public static final int SMALLER = 1;
        public static final int SMALL = 2;
        public static final int MEDIUM = 3;
        public static final int LARGE = 4;
    }

    private int imageSize = ImageSizes.LARGE;

    private int photoId;

    /*
     * Return comments to the photo in the response. Comments are returned in order of creation, 20 entries per page.
     */
    private boolean comments = true;

    /**
     * Return the specified page from the comments listing. Page numbers are 1-based.
     */
    private int commentsPage = 1;

    private String endpoint;

    public PhotoQuery(int id, String endpoint) {
        this.endpoint = endpoint;
        this.photoId = id;
    }

    /************** Interface implementation ********************/

    /**
     * @return part of the url to request for
     */
    public String getResourceURI() {
        StringBuilder sb = new StringBuilder(endpoint);
        sb.append("/").append(photoId);
        addFirstParameter("image_size", String.valueOf(imageSize), sb);
        addParameter("comments", String.valueOf(this.comments ? 1 : 0), sb);
        addParameter("comments_page", String.valueOf(commentsPage), sb);
        return sb.toString();
    }

    /**
     * @return GET or POST string
     */
    public String getMethod() {
        return GET_STRING;
    }

    /**
     * @return If method is POST return body of the request
     */
    public String getBody() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Class getResponseClass() {
        return PhotoResponse.class;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getImageSize() {
        return imageSize;
    }

    public void setImageSize(int imageSize) {
        this.imageSize = imageSize;
    }

    public boolean isComments() {
        return comments;
    }

    public void setComments(boolean comments) {
        this.comments = comments;
    }

    public int getCommentsPage() {
        return commentsPage;
    }

    public void setCommentsPage(int commentsPage) {
        this.commentsPage = commentsPage;
    }
}
