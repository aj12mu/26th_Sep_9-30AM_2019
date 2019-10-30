package corejava.Variables.Global_Variables;

public class Run_Helper {

	public static void main(String[] args) 
	{
		
		
		//Create object for class
		Helper obj=new Helper();
		
		//Assing runtime value to global variable..
		obj.browser_path="browser_drivers\\chromedriver.exe";
		obj.url="http://facebook.com";
		obj.Implicit_timeout=30;
		obj.launch_browser();
		
		//Assign username and password at runtime
		obj.UID="9030248855";
		obj.PWD="Hello123456";
		obj.user_signin();
	}

}
