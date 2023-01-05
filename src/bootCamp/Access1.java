package bootCamp;

public class Access1 {
	
	/*
	 * Four types of access modifiers are 
	 * default: doesn't need anything to go in front of the variable or method
	 * public: can be accessed from inside the package and outside the package
	 * private: can not be accessed from the package and outside
	 * protected: can be access from inside the same package and can be accessed from outside 
	 * the package only if it is a subclass of the current class.
	 */
	String stringdefault = "DefaultString";
	
	public  String stringpublic = "PublicString";
	
	// private String stringprivate = "PrivateString";
	
	protected String stringprotected = "ProtectedString";
	
	

}
