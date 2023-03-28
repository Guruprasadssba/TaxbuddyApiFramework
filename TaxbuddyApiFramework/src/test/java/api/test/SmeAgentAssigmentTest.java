package api.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import api.GenericUtilities.BaseClass;
import api.GenericUtilities.FileUtility;
import api.GenericUtilities.RestAssuredLibrary;
import api.endpoints.TaxbuddyEndpointsLibrary;
import api.listeners.ExtentTestManagerExtent;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;



public class SmeAgentAssigmentTest extends BaseClass
{

	FileUtility flib= new FileUtility();
	String expectedContenttype = "application/json;charset=UTF-8";
	int expectedStatuscode=200;

	@Test
	public void getAgentAssignItr() 
	{
		// Read the parameters from property file
		String userid = flib.getPropertyKeyValue("userid");
		String assyear = flib.getPropertyKeyValue("assessmentYear");
		String servicetypeITR = flib.getPropertyKeyValue("serviceTypeItr");

		//sending request to get sme user details for ITR
		Response response = TaxbuddyEndpointsLibrary.getSmeUser(userid, assyear, servicetypeITR);
		ValidatableResponse validateresponse = response.then().log().all();

		//validation
		Assert.assertEquals(response.getStatusCode(), expectedStatuscode, "Verified the Status code successfully");
		Assert.assertEquals(response.getContentType(), expectedContenttype, "Verified the content type successfully");

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :getAgentAssignItr");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is :" + validateresponse.extract().asPrettyString());

	}


	@Test
	public void getAgentAssignGST()
	{
		// Read the parameters from property file
		String serviceTypeGst = flib.getPropertyKeyValue("serviceTypeGst");
		String userid = flib.getPropertyKeyValue("userid");
		String assyear = flib.getPropertyKeyValue("assessmentYear");

		Response response = TaxbuddyEndpointsLibrary.getSmeUser(userid, assyear, serviceTypeGst);
		response.then().log().all();

		//Assert validation
		Assert.assertEquals(response.getStatusCode(), expectedStatuscode, "Verified the Status code successfully");
		Assert.assertEquals(response.getContentType(), expectedContenttype, "Verified the content type successfully");
	}

	@Test
	public void getAgentAssignNotice()
	{
		// Read the parameters from property file
		String serviceTypeNotice = flib.getPropertyKeyValue("serviceTypeNotice");
		String userid = flib.getPropertyKeyValue("userid");
		String assyear = flib.getPropertyKeyValue("assessmentYear");

		Response response = TaxbuddyEndpointsLibrary.getSmeUser(userid, assyear, serviceTypeNotice);
		response.then().log().all();

		//Assert validation
		Assert.assertEquals(response.getStatusCode(), expectedStatuscode, "Verified the Status code successfully");
		Assert.assertEquals(response.getContentType(), expectedContenttype, "Verified the content type successfully");
	}



}
