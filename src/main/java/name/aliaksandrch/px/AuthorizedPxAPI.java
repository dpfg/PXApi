package name.aliaksandrch.px;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

import name.aliaksandrch.px.queries.IQuery;

public class AuthorizedPxAPI extends AbstractPxApi {
	private final String accessToken;
	private final String tokenSecret;
	private final String consumerKey;
	private final String consumerSecret;

	public AuthorizedPxAPI(String consumerKey, String consumerSecret,
			String accessToken, String tokenSecret) {
		this.accessToken = accessToken;
		this.tokenSecret = tokenSecret;
		this.consumerKey = consumerKey;
		this.consumerSecret = consumerSecret;
		this.marshaller = new DefaultMarshaller();
		OAuthConsumer consumer = new DefaultOAuthConsumer(consumerKey, consumerSecret);
		consumer.setTokenWithSecret(accessToken, tokenSecret);
		httpClient = new OAuthHttpClient(consumer);
	}

	@SuppressWarnings("unchecked")
	public <T> T fetch(IQuery query) throws PxApiException {
		Class<T> clazz = (Class<T>) query.getResponseClass();
		String url = query.getResourceURI();
		url += "&consumer_key=" + consumerKey;
		String response = httpClient.getResponse(url);
		T fromString = (T) marshaller.getFromString(clazz, response);
		return clazz.cast(fromString);
	}

	public String getAccessToken() {
		return accessToken;
	}

	public String getTokenSecret() {
		return tokenSecret;
	}

	public String getConsumerKey() {
		return consumerKey;
	}

	public String getConsumerSecret() {
		return consumerSecret;
	}
}
