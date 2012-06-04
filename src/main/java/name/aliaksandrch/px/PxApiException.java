package name.aliaksandrch.px;

public class PxApiException extends RuntimeException{
	private static final long serialVersionUID = -7645590108692027370L;
	private Exception e;
	private String message;

	public PxApiException(String message){
		this.message = message;
	}
	
	public PxApiException(Exception e){
		this.e = e;
	}

	@Override
	public String getMessage() {
		if(e != null)
			return e.getMessage();
		return message;
	}

	
}
