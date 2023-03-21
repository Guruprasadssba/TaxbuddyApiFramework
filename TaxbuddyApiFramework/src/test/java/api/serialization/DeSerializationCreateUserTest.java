package api.serialization;

import java.io.File;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.payload.CreateUser;

public class DeSerializationCreateUserTest 
 {
	
	@Test
	public void createUserdataTest() throws Throwable, Throwable, Throwable
	{
		ObjectMapper obj= new ObjectMapper();
		
		CreateUser value = obj.readValue(new File(".\\Data\\userdata.json"),CreateUser.class );
		System.out.println( value.getFirstName());
	}
   

	
	
}
