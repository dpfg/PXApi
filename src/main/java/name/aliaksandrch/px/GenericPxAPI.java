package name.aliaksandrch.px;

import name.aliaksandrch.px.queries.IQuery;

class GenericPxAPI extends AbstractPxApi{
    private final String consumerKey;
    
    GenericPxAPI(String consumerKey) {
        this.consumerKey = consumerKey;
        this.marshaller = new DefaultMarshaller();
        this.httpClient = new DefaultHttpClient();
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

	public String getConsumerKey() {
		return consumerKey;
	}

}
