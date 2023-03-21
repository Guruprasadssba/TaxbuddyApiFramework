package api.test;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.GenericUtilities.FileUtility;
import api.endpoints.TaxbuddyEndpointsLibrary;
import api.payload.GstDetails;
import api.payload.UpdateUser;

public class UpdateUserProfileTest
{
	FileUtility flib= new FileUtility();
	@Test
	public void userprofileupdateTest() throws Throwable
	{
		// Read the parameters from property file
		String userId = flib.getPropertyKeyValue("uatUserid");
		String authorization = flib.getPropertyKeyValue("AuthAccessToken");

		ObjectMapper obj= new ObjectMapper();

		// Read the Data from object mapper
		UpdateUser data = obj.readValue(new File(".\\Data\\updateUserData.json"), UpdateUser.class);
		String firstname = data.getfName();
		String middlename = data.getmName();
		String lastname = data.getlName();
		String fname = data.getFatherName();
		String gender = data.getGender();
		String dob = data.getDateOfBirth();
		String mstatus = data.getMaritalStatus();
		String email = data.getEmailAddress();
		String aadhar = data.getAadharNumber();
		String pan = data.getPanNumber();
		String mob = data.getMobileNumber();
		String residentStatus = data.getResidentialStatus();
		String watsappnum = data.getWhatsAppNumber();
		String countrycode = data.getCountryCode();
		String lang = data.getLanguage();
		GstDetails gstupdate = data.getGstDetails();
		gstupdate.getGstPortalUserName();
		gstupdate.getGstPortalPassword();
		gstupdate.getGstinNumber();
		gstupdate.getTradeName();
		gstupdate.getLegalName();
		gstupdate.getGstinRegisteredMobileNumber();
		gstupdate.getSalesInvoicePrefix();
		gstupdate.getGstr1Type();
		gstupdate.getGstType();

         // create object for pojo class 
		UpdateUser payload= new UpdateUser(firstname, middlename, lastname, fname, gender, dob, mstatus, email, aadhar, pan, mob, residentStatus, watsappnum, countrycode, lang,gstupdate);

		//send request to update user profile details
		TaxbuddyEndpointsLibrary.updateUserProfileDetails(userId, payload, authorization)
		.then()
		.log().all();


	}
}
