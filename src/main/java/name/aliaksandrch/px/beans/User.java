package name.aliaksandrch.px.beans;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * The short format of a User object.
 * 
 * @author Aliaksandr_Chaiko
 * @version 0.1
 */
public class User implements Serializable{
	private static final long serialVersionUID = -6617481034264379462L;
	
	private int id;
	private String username;
	private String firstName;
	private String lastName;
	private String city;
	private String country;
	
	@SerializedName("upgrade_status")
	private String upgradeStatus;
	
	public User(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getUpgradeStatus() {
		return upgradeStatus;
	}

	public void setUpgradeStatus(String upgradeStatus) {
		this.upgradeStatus = upgradeStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
