package name.aliaksandrch.px.beans;

import java.io.Serializable;

public class Contacts implements Serializable{
	private String provider;
	private String id;
	
	public Contacts(){		
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
