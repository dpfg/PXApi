package name.aliaksandrch.px.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * The profile format of a User object.
 * 
 * @author Aliaksandr_Chaiko
 * @version 0.1
 */
public class Profile implements Serializable {
	private static final long serialVersionUID = -940091242212792988L;
	
	/* Simple */
	private int id;
    private String city;  
    private String country;
    private String state;
    private String about;
    private String locale;
    private int affection;
    private Map<String, String> contacts;
    private Map<String, List<String>> equipment;
    private Boolean following;
    
    /* Need to annotate */
    @SerializedName("username")
    private String username;

    @SerializedName("firstname")
    private String firstName;

    @SerializedName("lastname")
    private String lastName;

    @SerializedName("fullname")
    private String fullName;
    
    @SerializedName("registration_date ")
    private String registrationDate;

    @SerializedName("upgrade_status")
    private int upgradeStatus;
    
    @SerializedName("fotomoto_on")
    private boolean fotomotoOn;
    
    
    @SerializedName("friends_count")
    private int friendsCount;
    
    @SerializedName("followers_count")
    private int followersCount;
    
    @SerializedName("photos_count")
    private int photosCount;
    
    @SerializedName("in_favorites_count")
    private int inFavoritesCount;

    @SerializedName("userpic_url")
    private String userPicUrl;
    
    public Profile(){
    	
    }

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public int getAffection() {
		return affection;
	}

	public void setAffection(int affection) {
		this.affection = affection;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getUpgradeStatus() {
		return upgradeStatus;
	}

	public void setUpgradeStatus(int upgradeStatus) {
		this.upgradeStatus = upgradeStatus;
	}

	public boolean isFotomotoOn() {
		return fotomotoOn;
	}

	public void setFotomotoOn(boolean fotomotoOn) {
		this.fotomotoOn = fotomotoOn;
	}

	public int getFriendsCount() {
		return friendsCount;
	}

	public void setFriendsCount(int friendsCount) {
		this.friendsCount = friendsCount;
	}

	public int getFollowersCount() {
		return followersCount;
	}

	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}

	public int getPhotosCount() {
		return photosCount;
	}

	public void setPhotosCount(int photosCount) {
		this.photosCount = photosCount;
	}

	public int getInFavoritesCount() {
		return inFavoritesCount;
	}

	public void setInFavoritesCount(int inFavoritesCount) {
		this.inFavoritesCount = inFavoritesCount;
	}

	public String getUserPicUrl() {
		return userPicUrl;
	}

	public void setUserPicUrl(String userPicUrl) {
		this.userPicUrl = userPicUrl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Map<String, List<String>> getEquipment() {
		return equipment;
	}

	public void setEquipment(Map<String, List<String>> equipment) {
		this.equipment = equipment;
	}

	public Boolean getFollowing() {
		return following;
	}

	public void setFollowing(Boolean following) {
		this.following = following;
	}
    
    

}
