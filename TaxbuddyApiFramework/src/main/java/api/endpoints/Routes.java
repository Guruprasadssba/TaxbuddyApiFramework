package api.endpoints;

public class Routes 
  {
  // taxbuddy Environment -prod
	public static String base_url="https://api.taxbuddy.com";
	
	// UAT test Env
	public static String UATBase_url="https://uat-api.taxbuddy.com";
	
	//sme agent assignemt
	public static String getSmeAgentAssign_url=base_url+"/user/sme/agent-assignment";
	
	//signup create user
	public static String createUsersignup_url=base_url+"/user/user_account";
	
	//user profile update
	public static String updateUserProfileDetails_url=UATBase_url+"/user/profile/{userId}";
	
	
}
