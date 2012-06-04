package name.aliaksandrch.px;

import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.resources.PhotoResource;
import name.aliaksandrch.px.resources.UserResource;

import java.io.IOException;

public interface PxApi {

    PhotoResource getPhotoResource();

    UserResource getUserResource();

    void setHttpClient(IHttpClient httpClient);

    void setMarshaller(IMarshaller marshaller);
    
    <T> T fetch(IQuery query) throws IOException;
}
