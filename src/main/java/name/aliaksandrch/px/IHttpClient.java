package name.aliaksandrch.px;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Date: 11/13/11
 *
 * @Author Aliaksandr Chaiko
 */
public interface IHttpClient {

    String getResponse(String uri) throws PxApiException;

    String getResponse(String uri, Object data);

}
