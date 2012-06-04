package name.aliaksandrch.px.queries;

/**
 *
 * @Author Aliaksandr Chaiko
 */
public interface IQuery {

    String GET_STRING = "GET";
    String POST_STRING = "POST";

    /**
     *
     * @return part of the url to request for
     */
    String getResourceURI();

    /**
     *
     * @return GET or POST string
     */
    String getMethod();

    /**
     *
     * @return If method is POST return body of the request
     */
    String getBody();

    <T> Class<T> getResponseClass();

}
