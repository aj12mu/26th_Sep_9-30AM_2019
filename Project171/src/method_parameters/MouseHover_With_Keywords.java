package method_parameters;

public class MouseHover_With_Keywords {

	public static void main(String[] args) throws Exception 
	{
		

		//Create object for Repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("https://www.naukri.com/");
		obj.set_timeout(30);
		
		
		obj.mousehover("//div[@class='mTxt'][contains(.,'Jobs')]");
		obj.capturescreen("_Jobs_Sub_menu");
		obj.click_element("(//a[contains(.,'Register Now')])[1]");
		
		obj.switchto_window("Register on Naukri.com");
		obj.capturescreen("--Registrationpage");
		
		

	}

}
