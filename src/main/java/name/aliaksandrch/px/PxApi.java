package name.aliaksandrch.px;

import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.resources.PhotoResource;
import name.aliaksandrch.px.resources.UserResource;

import java.io.IOException;

public interface PxApi {
	static final String requestTokenURL = "https://api.500px.com/v1/oauth/request_token";
    static final String accessTokenURL = "https://api.500px.com/v1/oauth/access_token";
    static final String authorizeURL = "https://api.500px.com/v1/oauth/authorize";

    PhotoResource getPhotoResource();

    UserResource getUserResource();

    void setHttpClient(IHttpClient httpClient);

    void setMarshaller(IMarshaller marshaller);
    
    <T> T fetch(IQuery query) throws PxApiException;
}
