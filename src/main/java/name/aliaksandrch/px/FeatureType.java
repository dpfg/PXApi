package name.aliaksandrch.px;

/**
 * <p>
 * 500px.com allows discovery of the photography uploaded by users in a number of ways.
 * An essential part of presentation is photo streams. Accessing the following streams is possible 
 * though means of the API:
 *		popular — Return photos in Popular
 * 		upcoming — Return photos in Upcoming
 *		editors — Return photos in Editors' Choice
 * 		fresh_today — Return photos in Fresh Today
 *		fresh_yesterday — Return photos in Fresh Yesterday
 * 		fresh_week — Return photos in Fresh This Week
 * 		Per-user features (All per-user streams require a user_id or username parameter):
 * 		user — Return photos by a specific user, as displayed on http://500px.com/:username
 * 		user_friends — Return photos by users the specified user is following, as displayed on http://500px.com/:username/friends
 * 		user_favorites — Return photos added as favorites by the specified user, as displayed on http://500px.com/:username/favorites
 * </p>
 * 
 * @author Aliaksandr Chaiko
 * @version 0.1
 */
public enum FeatureType {
	
    /* Global features */
    POPULAR("popular"),
    UPCOMING("upcoming"),
    EDITORS("editors"),
    FRESH_TODAY("fresh_today"),
    FRESH_YESTERDAY("fresh_yesterday"),
    FRESH_WEEK("fresh_week"),

    /* Per-user features (All per-user streams require a user_id or username parameter) */
    USER("user"),
    USER_FRIENDS("user_friends"),
    USER_FAVORITES("user_favorites");

    private String featureName;

    private FeatureType(String name) {
        featureName = name;
    }

    public String getFeatureName() {
        return featureName;
    }

    public static FeatureType getByFeatureName(String fname){
        if(fname == null || fname.length() == 0 ){
            return null;
        }
        return FeatureType.valueOf(fname.toUpperCase());
    }

	@Override
	public String toString() {
		return featureName;
	}
    
    
}
