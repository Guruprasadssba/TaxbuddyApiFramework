package api.payload;

public class CreateUser 
{
	public String firstName;
	public String lastName;
	public String email;
	public String mobile;
	public String langKey;
	public String cognitoId;
	public String source;
	public String initialData;
	public String serviceType;
	public String countryCode;
	public String language;
	
	public CreateUser(String firstName, String lastName, String email, String mobile, String langKey, String cognitoId,
			String source, String initialData, String serviceType, String countryCode, String language) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.langKey = langKey;
		this.cognitoId = cognitoId;
		this.source = source;
		this.initialData = initialData;
		this.serviceType = serviceType;
		this.countryCode = countryCode;
		this.language = language;
	}
	
	public CreateUser()
	{
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLangKey() {
		return langKey;
	}

	public void setLangKey(String langKey) {
		this.langKey = langKey;
	}

	public String getCognitoId() {
		return cognitoId;
	}

	public void setCognitoId(String cognitoId) {
		this.cognitoId = cognitoId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getInitialData() {
		return initialData;
	}

	public void setInitialData(String initialData) {
		this.initialData = initialData;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
}
