package api.test;

import org.testng.annotations.Test;

import api.GenericUtilities.FileUtility;
import api.endpoints.TaxbuddyEndpointsLibrary;



public class SmeAgentAssigmentTest 
   {
	
	FileUtility flib= new FileUtility();
	
	 
        @Test
        public void getAgentAssignItr() throws Throwable
        {
        	// Read the parameters from property file
        	String userid = flib.getPropertyKeyValue("userid");
        	String assyear = flib.getPropertyKeyValue("assessmentYear");
        	String servicetypeITR = flib.getPropertyKeyValue("serviceTypeItr");
        	
        	//sending request to get sme userdetails for ITR
        	TaxbuddyEndpointsLibrary.getSmeUser(userid, assyear, servicetypeITR)
        	.then()
        	.log().all();
        }
     
        
        @Test
        public void getAgentAssignGST() throws Throwable
        {
        	// Read the parameters from property file
        	String serviceTypeGst = flib.getPropertyKeyValue("serviceTypeGst");
        	String userid = flib.getPropertyKeyValue("userid");
        	String assyear = flib.getPropertyKeyValue("assessmentYear");
        	
        	TaxbuddyEndpointsLibrary.getSmeUser(userid, assyear, serviceTypeGst)
        	.then()
        	.log().all();
        }
        
        
}
