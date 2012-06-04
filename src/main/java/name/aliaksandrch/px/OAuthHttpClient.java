package name.aliaksandrch.px;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import oauth.signpost.OAuthConsumer;

public class OAuthHttpClient implements IHttpClient {
	private OAuthConsumer consumer;

	public OAuthHttpClient(OAuthConsumer consumer) {
		this.consumer = consumer;
	}

	public String getResponse(String uri) throws PxApiException {
		StringBuilder sb = null;
		try {
			URL url = new URL(uri);
			HttpURLConnection  connection = (HttpURLConnection)url.openConnection();

			consumer.sign(connection);
			connection.connect();

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

	public String getResponse(String uri, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

}
