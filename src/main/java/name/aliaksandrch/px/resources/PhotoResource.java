package name.aliaksandrch.px.resources;

import name.aliaksandrch.px.FeatureType;
import name.aliaksandrch.px.queries.IQuery;
import name.aliaksandrch.px.queries.PhotoQuery;
import name.aliaksandrch.px.queries.PhotosQuery;
import name.aliaksandrch.px.queries.SearchPhotoQuery;
import name.aliaksandrch.px.queries.VoteQuery;

/**
 * @author  Aliaksandr Chaiko
 */
public class PhotoResource {
    private final static String RESOURCE_ENDPOINT = "https://api.500px.com/v1/photos";

    public enum SortingType {
        CREATED_AT("created_at"),
        RATING("rating"),
        TIMES_VIEWED("times_viewed"),
        VOTES_COUNT("votes_count"),
        FAVORITES_COUNT("favorites_count"),
        COMMENTS_COUNT("comments_count"),
        TAKEN_AT("taken_at");

        private String spelling;

        private SortingType(String spelling){
            this.spelling = spelling;
        }

        public String toString() {
            return spelling;
        }
    }
    
    public enum SeachType{
    	BY_TERM, BY_TAG
    }

    public PhotoResource() {
    }

    public PhotosQuery getPhotos(FeatureType feature) {
        return new PhotosQuery(feature, RESOURCE_ENDPOINT);
    }

    public PhotoQuery getPhoto(int id){
        return new PhotoQuery(id, RESOURCE_ENDPOINT);
    }
    
    public SearchPhotoQuery searchPhoto(SeachType type, String value){
    	SearchPhotoQuery q = new SearchPhotoQuery(RESOURCE_ENDPOINT);
    	switch (type) {
			case BY_TAG:
				q.setTag(value);
				break;
			case BY_TERM:
				q.setTerm(value);
				break;
			default:
				break;
		}
    	return q;
    }

    public IQuery vote(int id, int vote){
        return new VoteQuery(id, vote, RESOURCE_ENDPOINT);
    }

}
