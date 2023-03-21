package api.endpoints;

import static io.restassured.RestAssured.*;

import api.payload.CreateUser;
import api.payload.UpdateUser;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TaxbuddyEndpointsLibrary 
{
	public static Response getSmeUser(String userid,String assessmentyear,String servicetype)
	{
		Response response = given()
				.queryParam("userId",userid)
				.queryParam("assessmentYear",assessmentyear)
				.queryParam("serviceType",servicetype)
				.when()
				.get(Routes.getSmeAgentAssign_url);

		return response;
	}


	public static Response createNewUser(CreateUser payload)
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.post(Routes.createUsersignup_url);

		return response;
	}


	public static Response updateUserProfileDetails(String userid, UpdateUser payload,String Authentication)
	{
		Response response = given()
				.auth().oauth2(Authentication)
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("userId", userid)
				.body(payload)
				.when()
				.put(Routes.updateUserProfileDetails_url);

		return response;

	}




}
