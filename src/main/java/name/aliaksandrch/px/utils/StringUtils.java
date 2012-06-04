package name.aliaksandrch.px.utils;

/**
 * Date: 11/25/11
 *
 * @Author Aliaksandr Chaiko
 */
public class StringUtils {

    /**
     * Helper method to build request parameters. Appropriate for avoiding null in the request
     *
     * @param obj
     * @return String or empty string if param == null
     */
    public static String getSafeString(Object obj) {
        if (obj != null) {
            return obj.toString();
        } else {
            return "";
        }
    }

    public static void addParameter(String paramName, String paramValue, StringBuilder sb) {
        if (paramValue != null && paramValue.length() != 0) {
            sb.append("&").append(paramName).append("=").append(paramValue);
        }
    }

    public static void addFirstParameter(String paramName, String paramValue, StringBuilder sb) {
        if (paramValue != null && paramValue.length() != 0) {
            sb.append("?").append(paramName).append("=").append(paramValue);
        }
    }


}
