package name.aliaksandrch.px;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import name.aliaksandrch.px.queries.IQuery;

import oauth.signpost.OAuthConsumer;

public class OAuthHttpClient implements IHttpClient {
	private OAuthConsumer consumer;

	public OAuthHttpClient(OAuthConsumer consumer) {
		this.consumer = consumer;
	}

	public String getResponse(String uri) throws PxApiException {
		return getResponse(uri, IQuery.GET_METHOD, null);
	}

	public String getResponse(String uri, String data) throws PxApiException {
		return getResponse(uri, IQuery.POST_METHOD, data);
	}
	
	private String getResponse(String uri, String method, String data) throws PxApiException{
		StringBuilder sb = null;
		try {
			URL url = new URL(uri);
			HttpURLConnection  connection = (HttpURLConnection)url.openConnection();
			DataOutputStream wr = null;
			if(IQuery.POST_METHOD.equals(method)){
			    connection.setDoOutput(true);
			    connection.setDoInput(true);
			    connection.setRequestMethod(method);
			    connection.setRequestProperty("Content-Type", "text/plain");
			    connection.setRequestProperty("Content-Length", "" + Integer.toString(data.getBytes().length));
			    connection.setUseCaches(false);	    
			    consumer.sign(connection);
			    wr = new DataOutputStream(connection.getOutputStream());
			    wr.writeBytes(data);
			} else {
				consumer.sign(connection);
				connection.connect();
			}
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

}
