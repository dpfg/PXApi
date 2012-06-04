package name.aliaksandrch.px.queries;

import name.aliaksandrch.px.FeatureType;
import name.aliaksandrch.px.resources.PhotoResource;
import name.aliaksandrch.px.responses.PhotosResponse;

import static name.aliaksandrch.px.utils.StringUtils.addParameter;
import static name.aliaksandrch.px.utils.StringUtils.getSafeString;

public class PhotosQuery implements IQuery {
    private static final int DEFAULT_PHOTO_PER_PAGE = 50;
    private static final int DEFAULT_PAGE = 1;
    private String endpoint;
    private FeatureType feature;
    private String only;
    private String exclude;
    private PhotoResource.SortingType sort;
    private int page;
    private int resultsPerPage;

    public PhotosQuery(FeatureType feature, String endpoint) {
        this.feature = feature;
        this.endpoint = endpoint;
    }

    /************** Interface implementation ********************/

    /**
     * @return part of the url to request for
     */
    public String getResourceURI() {
        StringBuilder builder = new StringBuilder(50);
        builder.append(endpoint);
        builder.append("?");
        addParameter("feature", feature.getFeatureName(), builder);
        addParameter("only", only, builder);
        addParameter("exclude", exclude, builder);
        addParameter("sort", getSafeString(sort), builder);
        if (page == 0) {
            page = DEFAULT_PAGE;
        }
        addParameter("page", String.valueOf(page), builder);
        if (resultsPerPage == 0) {
            resultsPerPage = DEFAULT_PHOTO_PER_PAGE;
        }
        addParameter("rpp", String.valueOf(resultsPerPage), builder);
        return builder.toString();
    }

    /**
     * @return GET or POST string
     */
    public String getMethod() {
        return GET_STRING;
    }

    /**
     * @return If method is POST return body of the request
     */
    public String getBody() {
        return null;
    }

    public Class getResponseClass() {
        return PhotosResponse.class;
    }


    /**
     * *********** Specific query methods *******************
     */

    public FeatureType getFeature() {
        return feature;
    }

    public String getOnly() {
        return only;
    }

    /**
     * String name of the category to return photos from.
     *
     * @param only
     * @return
     */
    public PhotosQuery setOnly(String only) {
        this.only = only;
        return this;
    }

    public String getExclude() {
        return exclude;
    }

    public PhotosQuery setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }

    public PhotoResource.SortingType getSort() {
        return sort;
    }

    public PhotosQuery setSort(PhotoResource.SortingType sort) {
        this.sort = sort;
        return this;
    }

    public int getPage() {
        return page;
    }

    public PhotosQuery setPage(int page) {
        this.page = page;
        return this;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public PhotosQuery setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
        return this;
    }
}
