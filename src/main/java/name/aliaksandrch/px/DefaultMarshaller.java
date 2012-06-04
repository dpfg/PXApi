package name.aliaksandrch.px;

import com.google.gson.Gson;

/**
 * This class used to convert json string to the domain object.
 * @author Aliaksandr_Chaiko
 * @version 0.1
 */
public class DefaultMarshaller implements IMarshaller{
	
	/**
	 * Perform transformation
	 * @param 
	 */
    public <T> T getFromString(Class<T> clazz, String string){
        Gson gson = new Gson();
        T result = gson.fromJson(string, clazz);
        return result;
    }
}
