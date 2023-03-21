package api.payload;

public class GstDetails 

{
	public String gstPortalUserName;
    public String gstPortalPassword;
    public String gstinNumber;
    public String tradeName;
    public String legalName;
    public String gstinRegisteredMobileNumber;
    public String salesInvoicePrefix;
    public String gstr1Type;
    public String gstType;
    
	public GstDetails(String gstPortalUserName, String gstPortalPassword, String gstinNumber, String tradeName,
			String legalName, String gstinRegisteredMobileNumber, String salesInvoicePrefix, String gstr1Type,
			String gstType) {
		super();
		this.gstPortalUserName = gstPortalUserName;
		this.gstPortalPassword = gstPortalPassword;
		this.gstinNumber = gstinNumber;
		this.tradeName = tradeName;
		this.legalName = legalName;
		this.gstinRegisteredMobileNumber = gstinRegisteredMobileNumber;
		this.salesInvoicePrefix = salesInvoicePrefix;
		this.gstr1Type = gstr1Type;
		this.gstType = gstType;
	}
	
	public GstDetails()
	{
		
	}

	public String getGstPortalUserName() {
		return gstPortalUserName;
	}

	public void setGstPortalUserName(String gstPortalUserName) {
		this.gstPortalUserName = gstPortalUserName;
	}

	public String getGstPortalPassword() {
		return gstPortalPassword;
	}

	public void setGstPortalPassword(String gstPortalPassword) {
		this.gstPortalPassword = gstPortalPassword;
	}

	public String getGstinNumber() {
		return gstinNumber;
	}

	public void setGstinNumber(String gstinNumber) {
		this.gstinNumber = gstinNumber;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getGstinRegisteredMobileNumber() {
		return gstinRegisteredMobileNumber;
	}

	public void setGstinRegisteredMobileNumber(String gstinRegisteredMobileNumber) {
		this.gstinRegisteredMobileNumber = gstinRegisteredMobileNumber;
	}

	public String getSalesInvoicePrefix() {
		return salesInvoicePrefix;
	}

	public void setSalesInvoicePrefix(String salesInvoicePrefix) {
		this.salesInvoicePrefix = salesInvoicePrefix;
	}

	public String getGstr1Type() {
		return gstr1Type;
	}

	public void setGstr1Type(String gstr1Type) {
		this.gstr1Type = gstr1Type;
	}

	public String getGstType() {
		return gstType;
	}

	public void setGstType(String gstType) {
		this.gstType = gstType;
	}
	
    
}

