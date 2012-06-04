package name.aliaksandrch.px.beans;

import com.google.gson.annotations.SerializedName;

public class PhotoExtended extends Photo {
	private static final long serialVersionUID = -4378308484697972762L;

	@SerializedName("camera")
    private String camera;

    @SerializedName("lens")
    private String lens;

    @SerializedName("aperture")
    private String aperture;

    @SerializedName("focal_length")
    private String focalLength;

    @SerializedName("iso")
    private String ISO;

    @SerializedName("shutter_speed")
    private String shutterSpeed;

    @SerializedName("taken_at")
    private String takenAt;

    @SerializedName("location")
    private String location;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("longitude")
    private String longitude;

    /**
     *  For authorized user only
     */
    @SerializedName("voted")
    private boolean voted;

    /**
     *  For authorized user only
     */
    @SerializedName("favorited")
    private boolean favorited;

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    public String getISO() {
        return ISO;
    }

    public void setISO(String ISO) {
        this.ISO = ISO;
    }

    public String getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public String getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(String takenAt) {
        this.takenAt = takenAt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }
}
