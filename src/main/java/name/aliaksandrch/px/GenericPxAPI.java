package name.aliaksandrch.px;

import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.resources.PhotoResource;
import name.aliaksandrch.px.resources.UserResource;

import java.io.IOException;

class GenericPxAPI implements PxApi {
    private String consumerKey;
    private IMarshaller marshaller;
    private IHttpClient httpClient;

    GenericPxAPI(String consumerKey) {
        this.consumerKey = consumerKey;
        this.marshaller = new DefaultMarshaller();
        this.httpClient = new DefaultHttpClient();
    }

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

    @SuppressWarnings("unchecked")
	public <T> T fetch(IQuery query) throws IOException {
        Class<T> clazz = (Class<T>) query.getResponseClass();
        String url = query.getResourceURI();
        url += "&consumer_key=" + consumerKey;
        String response = httpClient.getResponse(url);
        T fromString = (T) marshaller.getFromString(clazz, response);
        return clazz.cast(fromString);
    }
}
