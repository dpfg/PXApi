package name.aliaksandrch.px;

public class ApiFactory {
    private static final ApiFactory instance = new ApiFactory();

    public static ApiFactory getInstance(){
        return instance;
    }

    public GenericPxAPI buildApi(String consumerKey){
        return new GenericPxAPI(consumerKey);
    }

}
