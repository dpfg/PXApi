package name.aliaksandrch.px;

/**
 * Date: 11/13/11
 *
 * @Author Aliaksandr Chaiko
 */
public interface IMarshaller {

    <T> T getFromString(Class<T> clazz, String string);
    
}
