package name.aliaksandrch.px.queries;

import name.aliaksandrch.px.PxApiRuntimeException;
import name.aliaksandrch.px.responses.SearchPhotoResponse;
import static name.aliaksandrch.px.utils.StringUtils.*;


public class SearchPhotoQuery implements IQuery {
	private static final int DEFAULT_RESULT_PER_PAGE = 50;
    private static final int DEFAULT_PAGE = 1;
    private final String endpoint;
	private String term;
	private String tag;
	private int page = 1;
	private int resultsPerPage = 20;
	
	public SearchPhotoQuery(String endpoint){
		this.endpoint = endpoint;
	}

	public String getResourceURI() {
		if(term == null && tag == null){
			throw new PxApiRuntimeException("You need to specify a search term or a tag.");
		}
		StringBuilder sb = new StringBuilder(endpoint);
		addFirstParameter("term", getSafeString(term), sb);
		addParameter("tag", getSafeString(tag), sb);
		
		if (page == 0) {
            page = DEFAULT_PAGE;
        }
		addParameter("page", String.valueOf(page), sb);
		if (resultsPerPage == 0) {
            resultsPerPage = DEFAULT_RESULT_PER_PAGE;
        }
		addParameter("rpp", String.valueOf(resultsPerPage), sb);
		return sb.toString();
	}

	public String getMethod() {
		return GET_METHOD;
	}

	public String getBody() {
		return null;
	}

	public Class getResponseClass() {
		return SearchPhotoResponse.class;
	}

	public String getTerm() {
		return term;
	}

	public SearchPhotoQuery setTerm(String term) {
		this.term = term;
		return this;
	}

	public String getTag() {
		return tag;
	}

	public SearchPhotoQuery setTag(String tag) {
		this.tag = tag;
		return this;
	}

	public int getPage() {
		return page;
	}

	public SearchPhotoQuery setPage(int page) {
		this.page = page;
		return this;
	}

	public int getResultsPerPage() {
		return resultsPerPage;
	}

	public SearchPhotoQuery setResultsPerPage(int resultsPerPage) {
		this.resultsPerPage = resultsPerPage;
		return this;
	}
	
	

}
