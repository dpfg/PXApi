package name.aliaksandrch.px;

import name.aliaksandrch.px.resources.PhotoResource;
import name.aliaksandrch.px.resources.UserResource;

public abstract class AbstractPxApi implements PxApi {
	protected IMarshaller marshaller;
	protected IHttpClient httpClient;

	public PhotoResource getPhotoResource() {
		return new PhotoResource();
	}

	public UserResource getUserResource() {
		return null;
	}

	public void setHttpClient(IHttpClient httpClient) {
		this.httpClient = httpClient;
	}

	public void setMarshaller(IMarshaller marshaller) {
		this.marshaller = marshaller;
	}

}
