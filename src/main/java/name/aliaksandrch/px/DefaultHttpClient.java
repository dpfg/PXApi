package name.aliaksandrch.px;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DefaultHttpClient implements IHttpClient {

    public DefaultHttpClient(){
        
    }

    public String getResponse(String uri) throws PxApiException {
        StringBuilder sb = null;
        try{
        	URL url = new URL(uri);
        
	        URLConnection connection = url.openConnection();
	        InputStream input = connection.getInputStream();
	        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
	        String inputString;
	        sb = new StringBuilder(256);
	        while ((inputString = reader.readLine()) != null) {
	            sb.append(inputString);
	        }
	        return sb.toString();
        } catch (Exception e) {
			throw new PxApiException(e);
		}
    }

    public String getResponse(String uri, String data) {
        return null; 
    }
}
