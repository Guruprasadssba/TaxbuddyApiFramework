package api.test;

import java.io.File;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.endpoints.TaxbuddyEndpointsLibrary;
import api.payload.CreateUser;

public class CreateUserTest 
{
	
	@Test
	public void SignupNewuserTest() throws Throwable, Throwable, Throwable
	{
      
		ObjectMapper obj= new ObjectMapper();

		//get the userdata from json file
		
		CreateUser data = obj.readValue(new File(".\\Data\\userdata.json"),CreateUser.class );
		String fname = data.getFirstName();
		String lname = data.getLastName();
		String email = data.getEmail();
		String langkey = data.getLangKey();
		String conid = data.getCognitoId();
		String source = data.getSource();
		String initialdata = data.getInitialData();
		String servicetype = data.getServiceType();
		String countrycode = data.getCountryCode();
		String lang = data.getLanguage();
		
		
		 CreateUser payload= new CreateUser(fname, lname, email, email, langkey, conid, source, initialdata, servicetype, countrycode, lang);
		 
        //sending post request
		 TaxbuddyEndpointsLibrary.createNewUser(payload)
		 .then()
		 .log().all();
	
	
	}
}
