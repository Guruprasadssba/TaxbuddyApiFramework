package api.GenericUtilities;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class RestAssuredLibrary 
{
  
			/**
			 * This method will return Json Data from the corresponding response body
			 * @param response
			 * @param path
			 * @return
			 */
		      public String GetJsonData(Response response,String path)
		      {
		    	  String JsonData = response.jsonPath().get(path);
		    	  return JsonData;
		    	  
		      }
		
}

