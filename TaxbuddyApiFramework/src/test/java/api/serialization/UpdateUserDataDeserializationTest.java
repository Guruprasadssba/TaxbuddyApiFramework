package api.serialization;


import java.io.File;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import api.payload.UpdateUser;

public class UpdateUserDataDeserializationTest
{

	@Test
	public void userDataUpdate() throws Throwable, Throwable, Throwable
	{
		ObjectMapper obj = new ObjectMapper();
		
		UpdateUser value = obj.readValue(new File(".\\Data\\updateUserData.json"), UpdateUser.class);
		
		System.out.println(value.getGstDetails().getTradeName());
	}
}
