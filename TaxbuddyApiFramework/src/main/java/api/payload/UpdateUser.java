package api.payload;

public class UpdateUser 
{
	public String fName;
	public String mName;
	public String lName;
	public String fatherName;
	public String gender;
	public String dateOfBirth;
	public String maritalStatus;
	public String emailAddress;
	public String aadharNumber;
	public String panNumber;
	public String mobileNumber;
	public String residentialStatus;
	public String whatsAppNumber;
	public String countryCode;
	public String language;
	public GstDetails gstDetails;

	public UpdateUser(String fName, String mName, String lName, String fatherName, String gender,
			String dateOfBirth, String maritalStatus, String emailAddress, String aadharNumber, String panNumber,
			String mobileNumber, String residentialStatus, String whatsAppNumber, String countryCode, String language,
			GstDetails gstDetails) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.fatherName = fatherName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.emailAddress = emailAddress;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.mobileNumber = mobileNumber;
		this.residentialStatus = residentialStatus;
		this.whatsAppNumber = whatsAppNumber;
		this.countryCode = countryCode;
		this.language = language;
		this.gstDetails = gstDetails;
	}
	
	public UpdateUser()
	{
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public String getWhatsAppNumber() {
		return whatsAppNumber;
	}
	public void setWhatsAppNumber(String whatsAppNumber) {
		this.whatsAppNumber = whatsAppNumber;
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
	public GstDetails getGstDetails() {
		return gstDetails;
	}
	public void setGstDetails(GstDetails gstDetails) {
		this.gstDetails = gstDetails;
	}



}
